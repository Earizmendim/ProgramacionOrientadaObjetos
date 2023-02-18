package Java_Basic.SentenciasDeControl;

public class SentenciasDeControl
{
    public static void main(String[] args)
    {
        boolean condicion = false;

        if(condicion)
        {
            System.out.println("Condicion Verdadera");
        }
        else
        {
            System.out.println("Condicion falsa");
        }

        int x = 11;

        if (x <= 10 || x >= 12)
        {
            System.out.println("Esto es correcto");
        }
        else
        {
            System.out.println("Esto es incorrecto");
        }

        int numero = 7;
        String texto = "Numero desconocido";
        if (numero == 1)
        {
            texto = "Numero Uno";
        }
        else if (numero == 2)
        {
            texto = "Numero Dos";
        }
        else if (numero == 3)
        {
            texto = "Numero Tres";
        }
        else if (numero == 4)
        {
            texto = "Numero Cuatro";
        }
        else
        {
            texto = "Numero Desconocido";
        }
        System.out.println("texto : " + texto);
    }
}