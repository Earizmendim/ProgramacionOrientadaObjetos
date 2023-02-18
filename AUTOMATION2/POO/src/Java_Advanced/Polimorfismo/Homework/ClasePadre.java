package Java_Advanced.Polimorfismo.Homework;

import java.util.Scanner;

public abstract class ClasePadre
{
    String nombre, apellidoPaterno, apellidoMaterno, hobbie, estadoCivil, nacionalidad, nombreCompleto, datosComplementarios;
    int edad;

    Scanner entrada = new Scanner(System.in);

        public void pedirDatos()
        {
         System.out.println("Proporcionar los siguientes datos de la persona: ");
         System.out.println("Dame el/los nombre(s): ");
         nombre = entrada.next();

         System.out.println("Dame el apellido paterno: ");
         apellidoPaterno = entrada.next();

         System.out.println("Dame el apellido materno: ");
         apellidoMaterno = entrada.next();
        }

        public void pedirAdicionales()
        {
         System.out.println("Dame la edad de la persona: ");
         edad = entrada.nextInt();

         System.out.println("Proporcione el hobbie de la persona:");
         hobbie = entrada.next();

         System.out.println("Proporcione el estado civil de la persona: ");
         estadoCivil = entrada.next();

         System.out.println("Dame la nacionalidad de la persona: ");
         nacionalidad = entrada.next();
        }

        public abstract void concatenar();

        public abstract void escribirInformacion();
}