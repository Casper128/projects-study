class BinaryTree:
    __result = []

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

    def getResult(self):
        return self.__result