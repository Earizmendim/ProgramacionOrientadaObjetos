package Java_Advanced.Polimorfismo.Homework;

public class ClaseHijaNombreCompleto extends ClasePadre
{
    @Override
    public void concatenar()
    {
        nombreCompleto = nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n";
    }

    @Override
    public void escribirInformacion()
    {
        System.out.println("El nombre completo de la persona es: " + nombreCompleto);
    }
}
