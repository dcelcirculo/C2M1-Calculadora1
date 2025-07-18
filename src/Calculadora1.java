import java.util.Scanner;

public class Calculadora1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el 1er numero: ");
        double a = entrada.nextDouble();
        System.out.print("Digite el 1er numero: ");
        double b = entrada.nextDouble();

        double suma = a + b;
        System.out.printf("El resultado de la suma es: %.2f\n", suma);

        double resta = a - b;
        System.out.printf("El resultado de la resta es: %.2f\n", resta);

        double multiplicacion = a * b;
        System.out.printf("El resultado de la multiplicacion es: %.2f\n", multiplicacion);

        double division = a / b;
        System.out.printf("El resultado de la division es: %.2f\n", division);
    }
}
