package com.mycompany.tareafortalecimiento;

import java.util.Scanner;

public class TareaFortalecimiento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        System.out.println();
        System.out.println("Bienvenido(a), " + nombre + ".");
        System.out.println("Tienes " + edad + " años.");
        System.out.println("Gracias por utilizar este programa.");

        teclado.close();
    }
}