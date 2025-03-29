import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese los grados en celsius:");
        double celsius = leer.nextDouble();

        System.out.println("Los grados en farenheith son: " + ((celsius * 9/5) + 32));
    }
}