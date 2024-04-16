import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número a calcular su factorial: ");
        int numero = Scanner.nextInt();

        System.out.println("El factorial es: " + factorial(numero));
        }

        public static long factorial(int numero){
            if (numero < 1)
                return 1;
            return numero * factorial(numero - 1)
    }
}