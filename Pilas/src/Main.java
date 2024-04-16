//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila(); // Creamos una instancia de la clase Pila

        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Apilar libro");
            System.out.println("2. Desapilar libro");
            System.out.println("3. Mostrar el libro en la cima");
            System.out.println("4. Mostrar longitud de la pila");
            System.out.println("5. Desapilar varios libros");
            System.out.println("6. Destructor (eliminar todos los libros)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.next(); // Cambio de tipo de dato de int a String
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.next();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.next();
                    pila.apilar(isbn, autor, titulo);
                    break;
                case 2:
                    if (!pila.isEmptyStack()) {
                        pila.desapilar();
                        System.out.println("Libro desapilado correctamente.");
                    } else {
                        System.out.println("La pila está vacía, no se puede desapilar.");
                    }
                    break;
                case 3:
                    pila.obtenerTope();
                    break;
                case 4:
                    System.out.println("La longitud de la pila es: " + pila.length());
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de libros a desapilar: ");
                    int cantidadDesapilar = scanner.nextInt();
                    pila.desapilar(cantidadDesapilar);
                    break;
                case 6:
                    pila.destructor();
                    System.out.println("Todos los libros han sido eliminados.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

            System.out.println(); // Línea en blanco para separar las iteraciones del menú

        } while (opcion != 7);
    }
}
