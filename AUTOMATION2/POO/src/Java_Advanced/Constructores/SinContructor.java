package Java_Advanced.Constructores;

import java.util.Scanner;

public class SinContructor
{
    private Scanner entrada = new Scanner(System.in);

    String nombre = "";

    public void pedirNombre()
    {
        System.out.println("¿Cuál es tu nombre?");
        nombre = entrada.nextLine();
    }

    public void imprimir()
    {
        System.out.println("Tu nombre es: " + nombre);
    }

}
