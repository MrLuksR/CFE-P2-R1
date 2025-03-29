import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese el primer numero:");
        int num = leer.nextInt();

        System.out.println("Ingese el segundo numero:");
        int num2 = leer.nextInt();

        System.out.println("La suma de estos numeros es: " + (num+num2));
    }
}