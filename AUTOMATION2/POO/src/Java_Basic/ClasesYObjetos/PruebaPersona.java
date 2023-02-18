package Java_Basic.ClasesYObjetos;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona objPersona = new Persona();

        objPersona.nombre = "Edher";
        objPersona.apellido = "Arizmendi";
        objPersona.edad = 34;
        objPersona.genero = "Masculino";
        objPersona.nacionalidad = "Mexicano";

        objPersona.MostrarInformacion();

    }
}
