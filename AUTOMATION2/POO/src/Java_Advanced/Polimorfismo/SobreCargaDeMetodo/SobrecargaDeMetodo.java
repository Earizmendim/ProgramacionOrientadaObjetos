package Java_Advanced.Polimorfismo.SobreCargaDeMetodo;

public class SobrecargaDeMetodo
{
    public void suma (int a, int b)
    {
        System.out.println("resultado : " + (a + b));
    }

    public void suma (int a, int b, int c)
    {
        System.out.println("resultado : " + (a + b + c));
    }

    public static void main(String[] args)
    {
        SobrecargaDeMetodo objSobreCarga = new SobrecargaDeMetodo();
        objSobreCarga.suma(100, 100);
        objSobreCarga.suma(200,200,200);
    }
}