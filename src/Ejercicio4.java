import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese el largo del rectangulo:");
        double largo = leer.nextDouble();

        System.out.println("Ingese el ancho del rectangulo:");
        double ancho = leer.nextDouble();

        System.out.println("El area de este rectangulo es: " + (largo*ancho));
    }
}