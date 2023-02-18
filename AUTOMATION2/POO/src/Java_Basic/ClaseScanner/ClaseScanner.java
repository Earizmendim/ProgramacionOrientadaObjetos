package Java_Basic.ClaseScanner;

import java.util.Scanner;

public class ClaseScanner
{
    public static void main(String[] args)
    {
        Scanner consola = new Scanner(System.in); // Esta funcion nos sirve para mandar datos a la consola
        System.out.println("Escribe tu nombre");
        var nombre = consola.nextLine();
        System.out.println("Nombre : " + nombre);
        System.out.println("Escibe tu profesion");
        var profesion = consola.nextLine();
        System.out.println("Usuario: " + profesion + " " + nombre);
    }
}