import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese su nombre:");
        String nombre = leer.nextLine();

        System.out.println("Ingese su edad:");
        String edad = leer.nextLine();

        System.out.println("Ingese su cuidad:");
        String cuidad = leer.nextLine();

        System.out.println("Hola, "+ nombre + ", tienes " + edad + " anios " + " y vives en " + cuidad);
    }
}