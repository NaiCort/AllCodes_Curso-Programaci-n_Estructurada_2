//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Suma de dígitos con ciclo While");
            System.out.println("2. Suma de números por arreglo");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumaDigitosConWhile();
                    break;
                case 2:
                    sumaNumerosPorArreglo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void sumaDigitosConWhile() {
        int sum = 0;
        int i = 1;

        // calcular la suma de los primeros 25 dígitos
        while (i <= 25) {
            sum += i;
            i++;
        }

        // imprimir el resultado
        System.out.println("La suma de los primeros 25 dígitos es: " + sum);
    }

    public static void sumaNumerosPorArreglo() {
        // Arreglo de números
        int[] arreglo = {1, 2, 3, 4, 5};

        // Variable para almacenar la suma
        int suma = 0;

        // Iterar sobre el arreglo y sumar los números
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        // Imprimir la suma
        System.out.println("La suma de los números en el arreglo es: " + suma);
    }
}
