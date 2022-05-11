package nb.ders8;
public class Uygulama {
    public static void main(String[] args) {
        Kutuphane kutuphane=new Kutuphane();
        KutuphanedekiKitap kitap1=new KutuphanedekiKitap("Nesne Yönelimli Analiz ve Tasarım",kutuphane);
        kitap1.sayfaEkle(new Sayfa(1,"sayfa 1 icerigi"));
        kitap1.sayfaEkle(new Sayfa(2,"Sayfa 2 içerigi"));
        kitap1.yazarEkle(new Yazar("Ahmet","İnan"));
        kitap1.yazarEkle(new Yazar("Ayşe","Karayel"));
        KutuphanedekiKitap kitap2=new KutuphanedekiKitap("Veritabanı Yönetim Sistemleri",kutuphane);
        kitap2.sayfaEkle(new Sayfa(1,"sayfa 1 icerigi"));
        kitap2.sayfaEkle(new Sayfa(2,"Sayfa 2 içerigi"));
        kitap2.yazarEkle(new Yazar("Zeynep","İnan"));
        kitap2.yazarEkle(new Yazar("Hamza","Karayel"));
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);
        System.out.println(kutuphane);
        kutuphane.getKitaplar().forEach(item-> System.out.println(item.getYazarlar()));
    }
}
