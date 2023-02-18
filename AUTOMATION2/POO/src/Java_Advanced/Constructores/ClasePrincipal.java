package Java_Advanced.Constructores;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        //Instancia a la clase que no tiene constructor
        SinContructor sin = new SinContructor();
        sin.pedirNombre();
        sin.imprimir();

        ConConstructor con = new ConConstructor();
    }
}