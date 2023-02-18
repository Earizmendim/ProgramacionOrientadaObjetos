package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

import java.util.Scanner;

public abstract class ClasePadre
{
    protected int valorUno, valorDos, resultado;

    Scanner entrada = new Scanner((System.in));

    public void pedirDatos()
    {
        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        valorDos = entrada.nextInt();
    }

    //Para el polimorfismo debemos crear metodos abtractos y por ende la clase tambien debe ser abdtracta.
    //Cabe mencionar que los metodos abstractos no llevan "{ }", ya que su logica (codigo), se implementa en otra clase.

    public abstract void Operaciones();

    public void mostrarResultado ()
    {
        System.out.println("El resultado es : " + resultado);
    }


}