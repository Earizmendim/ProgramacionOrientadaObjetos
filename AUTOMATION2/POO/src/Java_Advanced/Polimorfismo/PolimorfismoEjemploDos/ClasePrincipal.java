package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        ClasePadre suma = new ClaseHijaSuma();
        suma.pedirDatos();
        suma.Operaciones();
        suma.mostrarResultado();

        ClasePadre resta = new ClaseHijaResta();
        resta.pedirDatos();
        resta.Operaciones();
        resta.mostrarResultado();

    }
}
