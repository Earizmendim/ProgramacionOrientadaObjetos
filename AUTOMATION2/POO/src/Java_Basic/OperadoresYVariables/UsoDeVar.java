package Java_Basic.OperadoresYVariables;

public class UsoDeVar

{
    public static void main(String[] args)
    {
        //Uso de la palabra reservada "var", infiere en los tipos de datos
        var intEntera = 10;
        System.out.println(intEntera);
        var miNombre = "Edher";

        // Concatenacion de variables
        System.out.println("Mi nombre es: " + miNombre);

        // Concatenacion de variables Ejemplo 2

        var usuario = "Arizmendi";
        var ocupacion = "Tester";
        var perfil = ocupacion + " " + usuario;
        System.out.println("Perfil : " + perfil);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // Se realiza la suma, dado que no hay un texto previo
        System.out.println( i + j + " " + perfil); // Evalua de izquierda a derecha, realiza la suma y coloca el texto
        System.out.println(perfil + i + j); // Contexto cadena
        System.out.println(perfil + " " + (i + j)); // Uso de parentesis modifica la prioridad
    }
}