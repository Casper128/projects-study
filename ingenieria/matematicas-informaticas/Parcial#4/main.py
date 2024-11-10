from node import Node
from binary_tree import BinaryTree

def instance_node(current_node,direction='left'):
    value = int(input(f"\nIngrese el valor del nodo {'izquierdo' if direction == 'left' else 'derecho'}: "))
    new_node = Node(value)
    current_node.setLeft(new_node) if direction == 'left' else current_node.setRight(new_node)
    return new_node

def insert_node(root):
    if root is None:
        return
    
    while True:
        print(f"\nEn el nodo actual: {root.getValue()}")
        if root.getLeft() is None:
            print("1. Insertar nodo izquierdo")
        if root.getRight() is None:
            print("2. Insertar nodo derecho")
        print("3. No insertar nodo")
        
        choice = input("\nSeleccione una opción: ")

        if choice == '1':
            if root.getLeft() is None:
                new_node=instance_node(root,'left')
                insert_node(new_node)
            else:
                print("\nYa hay un nodo izquierdo. No se puede insertar más.")

        elif choice == '2':
            if root.getRight() is None:
                new_node=instance_node(root,'right')
                insert_node(new_node)
            else:
                print("\nYa hay un nodo derecho. No se puede insertar más.")
                
        elif choice == '3':
            return

        else:
            print("Opción no válida. Inténtalo de nuevo.")
            
def main_menu():
    print("\nMenú:")
    print("1. Insertar arbol")
    print("2. Reccorer inOrder")
    print("3. Reccorer preOrder")
    print("4. Reccorer postOrder")
    print("5. Reccorer por todas las opciones")
    print("6. Salir")

def read_tree(root,read_type='in'):
    binaryTree = BinaryTree()
    if read_type == 'in':
        print('inOrder')
        binaryTree.inOrder(root)
        print(binaryTree.getResult())
    if read_type == 'pre':
        print('preOrder')
        binaryTree.preOrder(root)
        print(binaryTree.getResult())
    if read_type == 'post':
        print('postOrder')
        binaryTree.postOrder(root)
        print(binaryTree.getResult())

def main():
    while True:
        main_menu()
        
        choice = input("\nSeleccione una opción: ")
        if choice == '1':
            root_value = int(input("\nIngrese el valor del nodo raíz: "))
            root = Node(root_value)
            insert_node(root)

        elif choice == '2':
            if root is not None:
                read_tree(root,"in")
            else:
                print("El árbol está vacío.")

        elif choice == '3':
            if root is not None:
                read_tree(root,"pre")
            else:
                print("El árbol está vacío.")
            
        elif choice == '4':
            if root is not None:
                read_tree(root,"post")
            else:
                print("El árbol está vacío.")
            
        elif choice == '5':
            if root is not None:
                read_tree(root,"in")
                read_tree(root,"pre")
                read_tree(root,"post")
            else:
                print("El árbol está vacío.")

        elif choice == '6':
            print("Saliendo...")
            break

        else:
            print("Opción no válida. Inténtalo de nuevo.")

main()