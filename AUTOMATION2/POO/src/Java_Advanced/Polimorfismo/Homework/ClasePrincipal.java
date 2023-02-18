package Java_Advanced.Polimorfismo.Homework;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        ClasePadre completeName = new ClaseHijaNombreCompleto(); //
        completeName.pedirDatos();
        completeName.concatenar();
        completeName.escribirInformacion();

        ClasePadre complementaryInfo = new ClaseHijaDatosAdicionales(); //
        complementaryInfo.pedirAdicionales();
        complementaryInfo.concatenar();
        complementaryInfo.escribirInformacion();
    }
}