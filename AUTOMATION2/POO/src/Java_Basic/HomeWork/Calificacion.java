package Java_Basic.HomeWork;

public class Calificacion extends Promedio
{
    void calFinal()
    {
        if (promedio >= 6)
        {
            System.out.println("El alumno aprobo con calificacion final de: " + promedio);
        }
        else
        {
            System.out.println("El alumno reprobo con calificación final de: " + promedio);
        }
    }
}
