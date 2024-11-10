import numpy as np
import networkx as nx
import matplotlib.pyplot as plt


class Grafo:
    __matrix = []
    __rows = None
    __columns = None
    directed = False
    isIncidence = False
    graph = None
    subtotals = []

    # Constructor
    def __init__(self, rows, columns=None, directed=False, isIncidence=False):
        self.setRows(rows)
        self.setColumns(columns)
        self.directed = directed
        self.isIncidence = isIncidence
        self.subtotals = [0] * (columns if columns is not None else rows)
        self.fillMatrix()

    def setRows(self, rows):
        if (rows <= 0):
            raise ValueError(
                "The number of columns cannot be negative or zero")
        self.__rows = rows

    def setColumns(self, columns):
        if columns is not None and columns < 0:
            raise ValueError(
                "The number of columns cannot be negative or zero")
        self.__columns = columns

    def isValidNumber(self, i, j):
        while True:
            inputValueNode = int(
                input("Enter the value of the node: ["+str(i)+"]["+str(j)+"]: "))
            if inputValueNode == 0 or inputValueNode == 1 or (inputValueNode == -1 and self.isIncidence and self.directed):
                return inputValueNode
            print("The value must be 0 or 1")

    def display_matrix(self, arrayAux2, arrayDegree):
        print('\n')
        print(
            f"{ 'Incidence' if self.isIncidence else 'Adjacency' } Matrix: ", self.__matrix)
        print(
            f"{ 'Incidents' if self.isIncidence else 'Adjacencies' } of each vertex: ", arrayAux2)
        print("Degree:", arrayDegree)

    def create_graph(self):
        
        self.__matrix = np.array(self.__matrix)
        
        if self.directed and self.isIncidence == False:
            self.graph = nx.from_numpy_array(self.__matrix, create_using=nx.DiGraph)
        elif self.directed == False and self.isIncidence == False:
            self.graph = nx.from_numpy_array(self.__matrix, create_using=nx.Graph) 
        elif self.directed and self.isIncidence:
            self.graph = nx.DiGraph()
        elif self.directed == False and self.isIncidence:
            self.graph = nx.Graph()
        

        if self.isIncidence:
            for i in range(self.__matrix.shape[0]):
                self.graph.add_node(i)
            for i in range(self.__matrix.shape[1]):
                node1 = None
                node2 = None
                for j in range(self.__matrix.shape[0]):
                    if self.__matrix[j][i] == 1 or (self.directed and self.__matrix[j][i] == -1):
                        if node1 is None:
                            node1 = j
                        else:
                            node2 = j
                self.graph.add_edge(node1, node2)

    def draw_graph(self):
        pos = nx.spring_layout(self.graph)
        nx.draw_networkx_nodes(
            self.graph, pos, node_size=700, node_color='skyblue')
        nx.draw_networkx_edges(self.graph, pos, arrowstyle='-|>',
                                arrowsize=20, edge_color='black', arrows=self.directed)
        nx.draw_networkx_labels(
            self.graph, pos, font_size=12, font_family='sans-serif')
        plt.title("Directed Graph" if self.directed else "Undirected Graph")
        plt.axis('off')
        plt.show()

    def validate(self):
        for value in self.subtotals:
            if value < 2:
                print("The value of this position does not match an adjacency matrix")
                return
        print("It is a correct incidence matrix",self.subtotals)

    def fillMatrix(self):
        print('\n')
        self.__matrix = []
        arrayAux2 = []
        arrayDegree = []
        for i in range(self.__rows):
            arrayAux = []
            cols = self.__rows if self.__columns == None else self.__columns
            accumulator = 0
            for j in range(cols):
                inputValueNode = self.isValidNumber(i + 1, j + 1)
                accumulator += abs(inputValueNode)
                self.subtotals[j] += inputValueNode
                if inputValueNode == 1:
                    arrayAux2.append(f"({i + 1},{j + 1})")
                if self.isIncidence == False and i == j and inputValueNode != 0:
                    print("The value of this position does not match an adjacency matrix")
                    return
                arrayAux.append(inputValueNode)
            arrayDegree.append(f"Vertex {i + 1}: {accumulator}")
            self.__matrix.append(arrayAux)

            if self.directed == False and accumulator == 0:
                print(
                    "A vertex cannot be disconnected in the incidence/adjacency matrix.")
                return
        if self.isIncidence:
            self.validate()
        self.display_matrix(arrayAux2, arrayDegree)
        self.create_graph()
        self.draw_graph()
