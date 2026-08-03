package com.mycompany.tareafortalecimiento;

import java.util.Scanner;

public class TareaFortalecimiento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   SISTEMA DE REGISTRO DE USUARIO");
        System.out.println("====================================");

        // Datos personales
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = teclado.nextLine();

        int edad;
        do {
            System.out.print("Ingrese su edad: ");
            edad = teclado.nextInt();

            if (edad <= 0) {
                System.out.println("La edad debe ser mayor que 0.");
            }

        } while (edad <= 0);

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = teclado.nextDouble();

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingrese su nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Ingrese su nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Ingrese su nota 3: ");
        double nota3 = teclado.nextDouble();

        // Cálculos
        double promedio = (nota1 + nota2 + nota3) / 3;
        double imc = peso / (estatura * estatura);

        String categoriaEdad;

        if (edad < 18) {
            categoriaEdad = "Menor de edad";
        } else if (edad < 60) {
            categoriaEdad = "Adulto";
        } else {
            categoriaEdad = "Adulto mayor";
        }

        String estado;

        if (promedio >= 61) {
            estado = "APROBADO";
        } else {
            estado = "REPROBADO";
        }

        String clasificacionIMC;

        if (imc < 18.5) {
            clasificacionIMC = "Bajo peso";
        } else if (imc < 25) {
            clasificacionIMC = "Peso normal";
        } else if (imc < 30) {
            clasificacionIMC = "Sobrepeso";
        } else {
            clasificacionIMC = "Obesidad";
        }

        // Menú
        int opcion;

        do {

            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Mostrar datos personales");
            System.out.println("2. Mostrar promedio");
            System.out.println("3. Mostrar IMC");
            System.out.println("4. Mostrar categoría por edad");
            System.out.println("5. Mostrar toda la información");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nNombre: " + nombre + " " + apellido);
                    System.out.println("Edad: " + edad);
                    break;

                case 2:
                    System.out.printf("\nPromedio: %.2f\n", promedio);
                    System.out.println("Estado: " + estado);
                    break;

                case 3:
                    System.out.printf("\nIMC: %.2f\n", imc);
                    System.out.println("Clasificación: " + clasificacionIMC);
                    break;

                case 4:
                    System.out.println("\nCategoría: " + categoriaEdad);
                    break;

                case 5:
                    System.out.println("\n========= REPORTE =========");
                    System.out.println("Nombre: " + nombre + " " + apellido);
                    System.out.println("Edad: " + edad);
                    System.out.println("Categoría: " + categoriaEdad);
                    System.out.printf("Estatura: %.2f m\n", estatura);
                    System.out.printf("Peso: %.2f kg\n", peso);
                    System.out.printf("IMC: %.2f\n", imc);
                    System.out.println("Clasificación IMC: " + clasificacionIMC);
                    System.out.printf("Promedio: %.2f\n", promedio);
                    System.out.println("Estado: " + estado);
                    break;

                case 6:
                    System.out.println("\nGracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("\nOpción no válida.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}