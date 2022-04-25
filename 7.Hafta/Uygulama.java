package nb.ders7.nesnelerindepolanmasi.lab;

public class Uygulama {
    public static void main(String[] args) {
        Kitap kitap=new Kitap("Nesne Yönelimli Analiz ve Tasarım");
        System.out.println(kitap);
        kitap.sayfaEkle(new Sayfa(1,"sayfa 1 icerigi"));
        kitap.sayfaEkle(new Sayfa(2,"Sayfa 2 içerigi"));
        kitap.yazarEkle(new Yazar("Ahmet","İnan"));
        kitap.yazarEkle(new Yazar("Ayşe","Karayel"));
        System.out.println(kitap.sayfayiGetir(1));
        kitap.tumSayfalariYazdir();
    }
}