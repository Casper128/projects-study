class BinaryTree:
    __result = []

    def read_tree(self,root, read_type='in'):
        if read_type == 'in':
            print('inOrder')
            self.inOrder(root)
            print(self.getResult())
        if read_type == 'pre':
            print('preOrder')
            self.preOrder(root)
            print(self.getResult())
        if read_type == 'post':
            print('postOrder')
            self.postOrder(root)
            print(self.getResult())

    def inOrder(self,node, cont = 0):
        if cont == 0:
            self.__result.clear()
        cont += 1
        if node is not None:
            self.inOrder(node.getLeft(), cont)
            self.__result.append(node.getValue())
            self.inOrder(node.getRight(), cont)

    def preOrder(self,node,cont = 0):
        if cont == 0:
            self.__result.clear()
        cont += 1
        if node is not None:
            self.__result.append(node.getValue())
            self.preOrder(node.getLeft(), cont)
            self.preOrder(node.getRight(), cont)
            
    def postOrder(self,node,cont = 0):
        if cont == 0:
            self.__result.clear()
        cont += 1
        if node is not None:
            self.postOrder(node.getLeft(), cont)
            self.postOrder(node.getRight(), cont)
            self.__result.append(node.getValue())

    def search_binary_tree(self, current_node, value):
        if current_node is None:
            print("El usuario no existe")
            return

        print(f"\nEn el nodo actual: {current_node.getValue()}")

        if current_node.getValue() == value:
            print("El Id del usuario buscado existe: ", current_node.getValue())
            return
        elif value < current_node.getValue():
            self.search_binary_tree(current_node.getLeft(), value)
        elif value > current_node.getValue():
            self.search_binary_tree(current_node.getRight(), value)


    def insert_binary_tree(self, current_node, new_node, value):
        print(f"\nEn el nodo actual: {current_node.getValue()}")

        if current_node.getValue() == value:
            print("Este usuario ya existe")
            return current_node

        elif value < current_node.getValue():
            if current_node.getLeft() is None:
                current_node.setLeft(new_node)
                return current_node
            else:
                current_node.setLeft(self.insert_binary_tree(current_node.getLeft(), new_node, value))
                return current_node

        elif value > current_node.getValue():
            if current_node.getRight() is None:
                current_node.setRight(new_node)
                return current_node
            else:
                current_node.setRight(self.insert_binary_tree(current_node.getRight(), new_node, value))
                return current_node

    def getResult(self):
        return self.__result