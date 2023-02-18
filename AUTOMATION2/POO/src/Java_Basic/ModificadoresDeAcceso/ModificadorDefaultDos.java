package Java_Basic.ModificadoresDeAcceso;

class ModificadorDefaultDos
{
    public static void main(String[] args) //Public es motor de arranque sin public no podremos arrancar nuestra clase
    {
        ModificadorDefault objModificadorDefault = new ModificadorDefault();    //Creando objeto para poder traer método "ejemplo" de la clase ModificadorDefault
        ModificadorPublico objMetodoPublico = new ModificadorPublico();

        objModificadorDefault.ejemplo();
        objModificadorDefault.ejemploDos();
        objMetodoPublico.ejemploCuatro();

        /*En este modificador de acceso por defecto, nos permite acceder a los métodos o atributos de una clase,
        siempre y cuando se encuentren en el mismo package, sino estuvieran las dos clases en el mismo package
        al utilizar este modificador de acceso, nos devolvería un error de compilación*/



    }


}
