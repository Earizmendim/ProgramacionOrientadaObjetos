package Java_Basic.Metodos;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.b = 8;
        aritmetica.a = 5;
        aritmetica.sumar();


        var resultado = aritmetica.SumarConRetorno();
        //System.out.println("El resultado es: " + aritmetica.SumarConRetorno());
        //aritmetica.SumarConRetorno();
        System.out.println("El resultado es : " + aritmetica.SumarConRetorno());

        resultado = aritmetica.SumarConParametros(10,85);
        System.out.println("Resultado usando parametros : " + resultado);



    }


}
