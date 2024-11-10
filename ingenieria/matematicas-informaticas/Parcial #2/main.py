from matrix import Grafo

def mostrar_menu_principal():
    print("\nSelect an option:")
    print("1. Enter Adjacency Matrix")
    print("2. Enter Incidence Matrix")
    print("3. End execution")

def main():
    while True:
        mostrar_menu_principal()
        opcion_principal = input("Enter your option: ")

        if opcion_principal == '1':
            rows=int(input("Enter the value of the node: "))
            Grafo(rows)
        elif opcion_principal == '2':
            rows=int(input("Enter the value of the rows: "))
            cols=int(input("Enter the value of the cols: "))
            if rows == cols:
                print('\n')
                print("It can't be a square matrix")
                continue
            Grafo(rows, cols)
        elif opcion_principal == '3':
            print('\n')
            print("Stopping the program...")
            break
        else:
            print("Invalid option, try again.")   
main()