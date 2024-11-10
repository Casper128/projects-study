class Node:
    __value = None
    __left = None
    __right = None

    def __init__(self, value):
        self.setValue(value)

    def setValue(self, value):
        if value == '':
            print("El valor no puede estar vacío")
        else:
            self.__value = value

    def getValue(self):
        return self.__value
    
    def getRight(self):
        return self.__right
    
    def getLeft(self):
        return self.__left

    def setLeft(self, left):
        self.__left = left

    def setRight(self, right):
        self.__right = right


