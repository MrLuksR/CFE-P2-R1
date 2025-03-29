import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingese su anio de nacimiento:");
        int anio = leer.nextInt();

        System.out.println("Ingese el anio actual:");
        int anio2 = leer.nextInt();

        System.out.println("Su edad es: " + (anio2-anio));
    }
}