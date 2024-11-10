from matrix_graph import Grafo

def mostrar_menu_principal():
    print("\nSelect an option:")
    print("1. Enter Adjacency Matrix (Undirected)")
    print("2. Enter Incidence Matrix (Undirected)")
    print("3. Enter Adjacency Matrix (Directed)")
    print("4. Enter Incidence Matrix (Directed)")
    print("5. End execution")

def main():
    while True:
        mostrar_menu_principal()
        opcion_principal = input("Enter your option: ")

        if opcion_principal in ['1', '2', '3', '4']:
            
            while True:
                try:
                    rows = int(input("Enter the number of rows: "))
                    break
                except ValueError:
                    print("Error: Please enter an integer value.")
            
            if opcion_principal == '1':
                Grafo(rows, directed=False)
            elif opcion_principal == '2':
                cols = int(input("Enter the number of columns: "))
                Grafo(rows, cols, isIncidence=True)
            elif opcion_principal == '3':
                Grafo(rows, directed=True)
            elif opcion_principal == '4':
                cols = int(input("Enter the number of columns: "))
                Grafo(rows, cols, directed=True, isIncidence=True)

        elif opcion_principal == '5':
            print("\nStopping the program...")
            break
        else:
            print("Invalid option, try again.")

main()