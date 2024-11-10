class Grafo:
    __matrix = [] #atributo privado
    __rows = None
    __columns = None
    __posiciones = None

    #constructor
    def __init__(self, rows, columns = None):
            self.setRows(rows)
            self.setColumns(columns)
            self.fillMatrix() 

    def setRows(self, rows):
        if(rows <= 0):
            raise ValueError("El numero de filas no puede ser negativo o cero")
        self.__rows = rows
    
    def setColumns(self, columns):
        if columns is not None and columns < 0:
            raise ValueError("El numero de columnas no puede ser negativo o cero")
        self.__columns = columns
    
    def isValidNumber(self, i, j):
        while True:
            inputValueNode = int(input("Enter the value of the node: ["+str(i)+"]["+str(j)+"]: "))
            if inputValueNode == 0 or inputValueNode == 1:
                return inputValueNode
            print("The value must be 0 or 1 or enter -1 to exit")
            
    def fillMatrix(self):
        print('\n')
        self.__matrix=[]
        arrayAux2 = []	
        for i in range(self.__rows):
            i+=1
            arrayAux = []
            cols= self.__rows if self.__columns == None else self.__columns
            for j in range(cols):
                j+=1
                inputValueNode = self.isValidNumber(i, j)
                if inputValueNode == 1:
                    arrayAux2.append("("+str(i)+","+str(j)+")")
                if self.__rows == cols and i==j and inputValueNode != 0:
                    print("The value of this position does not match an adjacency matrix")
                    return
                arrayAux. append(inputValueNode)   
            self.__matrix.append(arrayAux)
        
        if self.__rows == cols:
            print('\n')
            print("Matriz Adyacencia: ",self.__matrix)
            print("Adyacencias: ",arrayAux2)
        else:
            print('\n')
            print("Matriz Incidencia: ",self.__matrix)
            print("Incidencias: ",arrayAux2)
        