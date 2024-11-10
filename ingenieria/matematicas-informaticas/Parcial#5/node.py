class Node:
    __value = None
    __left = None
    __right = None
    __name = None
    __city = None
    __age = None

    def __init__( self, value, name=None, city=None, age=None ):
        self.setValue(value)
        self.setName(name)
        self.setCity(city)
        self.setAge(age)

    def getValue(self):
        return self.__value
    
    def getLeft(self):
        return self.__left

    def getRight(self):
        return self.__right
    
    def getName(self):
        return self.__name
    
    def getCity(self):
        return self.__city

    def getAge(self):
        return self.__age

    def setValue(self, value):
        if value == '':
            print("El valor no puede estar vacío")
        else:
            self.__value = value

    def setLeft(self, left):
        self.__left = left

    def setRight(self, right):
        self.__right = right

    def setName(self, name):
        self.__name = name

    def setCity(self, city):
        self.__city = city

    def setAge(self, age):
        self.__age = age