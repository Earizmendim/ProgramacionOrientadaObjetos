package Java_Advanced.Polimorfismo.Homework;

public class ClaseHijaDatosAdicionales extends ClasePadre
{
    @Override
    public void concatenar()
    {
        datosComplementarios = "Edad: " + edad + ", Hobbie: " + hobbie + ", Estado Civil: " + estadoCivil + ", Nacionalidad: " + nacionalidad;
    }

    @Override
    public void escribirInformacion()
    {
        System.out.println("Los datos complementarios de la persona son:\n" + datosComplementarios);
    }
}