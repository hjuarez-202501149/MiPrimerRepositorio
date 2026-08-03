import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        System.out.println();
        System.out.println("=================================");
        System.out.println("¡Bienvenido al programa!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Mucho gusto en conocerte.");
        System.out.println("=================================");

        teclado.close();
    }
}