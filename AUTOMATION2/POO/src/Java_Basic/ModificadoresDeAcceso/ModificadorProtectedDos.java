package Java_Basic.ModificadoresDeAcceso;

public class ModificadorProtectedDos extends ModificadorProtected //Aquí estamos heredando los elementos de la clase ModoficadorProtected
{
    public static void main(String[] args)
    {
        ModificadorProtectedDos objModificadorProtectedDos = new ModificadorProtectedDos();
        objModificadorProtectedDos.datos(); //este método datos lo estamos heredando desde "Modificador Protected"

    }

}
