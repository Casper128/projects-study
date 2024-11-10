from node import Node
from binary_tree import BinaryTree

def insert_node(binaryTree, root=None):
    while True:
        if root is not None:
            print(f"\nEn el nodo actual: {root.getValue()}")
        else:
            print("\nEl árbol está vacío.")

        print("1. Insertar nodo")
        print("2. No insertar nodo")

        choice = input("\nSeleccione una opción: ")

        if choice == '1':
            value = int(input(f"\nIngrese la cédula del usuario: "))
            new_node = Node(value)
            root = binaryTree.insert_binary_tree(root, new_node, value)

        elif choice == '2':
            return root

        else:
            print("Opción no válida. Inténtalo de nuevo.")

def main_menu():
    print("\nMenú:")
    print("1. Insertar árbol")
    print("2. Buscar por usuario por cédula")
    print("3. Recorrer inOrder")
    print("4. Recorrer preOrder")
    print("5. Recorrer postOrder")
    print("6. Recorrer por todas las opciones")
    print("7. Salir")

def main():
    root = None
    binaryTree = BinaryTree()
    
    while True:
        main_menu()

        choice = input("\nSeleccione una opción: ")
        if choice == '1':
            while True:
                print("1. Crear un nuevo árbol")
                if root is not None:
                    print("2. Insertar más nodos al árbol actual")
                print("3. Salir")

                insert_choice = input("\nSeleccione una opción: ")

                if insert_choice == '1':
                    root_value = int(input("\nIngrese el valor del nodo raíz: "))
                    root = Node(root_value)
                    root = insert_node(binaryTree, root)
                elif insert_choice == '2':
                    if root is not None:
                        root = insert_node(binaryTree, root)
                    else:
                        print("Primero crea un árbol.")
                elif insert_choice == '3':
                    print("Saliendo de insertar árboles..")
                    break
                else:
                    print("Opción no válida. Inténtalo de nuevo.")

        elif choice == '2':
            if root is not None:
                id_user = int(input("\nIngrese la cédula del usuario a buscar: "))
                binaryTree.search_binary_tree(root, id_user)
            else:
                print("El árbol está vacío.")

        elif choice == '3':
            if root is not None:
                binaryTree.read_tree(root, "in")
            else:
                print("El árbol está vacío.")

        elif choice == '4':
            if root is not None:
                binaryTree.read_tree(root, "pre")
            else:
                print("El árbol está vacío.")

        elif choice == '5':
            if root is not None:
                binaryTree.read_tree(root, "post")
            else:
                print("El árbol está vacío.")

        elif choice == '6':
            if root is not None:
                binaryTree.read_tree(root, "in")
                binaryTree.read_tree(root, "pre")
                binaryTree.read_tree(root, "post")
            else:
                print("El árbol está vacío.")

        elif choice == '7':
            print("Saliendo...")
            break

        else:
            print("Opción no válida. Inténtalo de nuevo.")

main()