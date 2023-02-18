package Java_Basic.OperadoresYVariables;

public class OperadoresCondicionales
{
    public static void main(String[] args)
    {
        var a = 5;
        var resultado = a >= 0 && a <= 10;

        if (resultado)
        {
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");
        }
    }
}
