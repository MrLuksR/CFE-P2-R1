import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese precio del primer producto:");
        double prod1 = leer.nextDouble();

        System.out.println("Ingese precio del segundo producto:");
        double prod2 = leer.nextDouble();

        System.out.println("Ingese precio del tercer producto:");
        double prod3 = leer.nextDouble();

        double total;
        total = (prod1+prod2+prod3);

        System.out.println("El total es: " + (total + (total*22)/100) + " IVA incluido.");
    }
}