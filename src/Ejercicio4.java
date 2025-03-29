import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese la base del triangulo:");
        double base = leer.nextDouble();

        System.out.println("Ingese la altura del triangulo:");
        double altura = leer.nextDouble();

        System.out.println("El area de este triangulo es: " + (base*altura)/2);
    }
}