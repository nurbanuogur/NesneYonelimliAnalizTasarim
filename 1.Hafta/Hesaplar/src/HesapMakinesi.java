import java.util.Scanner;
import java.text.DecimalFormat;

public class HesapMakinesi
{
    public static void main(String[] s)
    {

        Hesaplar hesap= new Hesaplar(80,20);
        System.out.println(hesap.Toplama());
        System.out.println(hesap.Cikarma());
        System.out.println(hesap.Carpma());
        System.out.println(hesap.Bolme());

        Scanner input = new Scanner (System.in);

        System.out.print ("İkinci Sayiyi giriniz=");
        int ikinci = input.nextInt();

        Hesaplar hesap2= new Hesaplar(20,ikinci);
        System.out.println(hesap2.Toplama());
        System.out.println(hesap2.Cikarma());
        System.out.println(hesap2.Carpma());
        System.out.println(hesap2.Bolme());

    }
}
