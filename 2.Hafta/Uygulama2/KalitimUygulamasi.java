package ders1.uygulama2;

public class KalitimUygulamasi {

    public static void main(String[] args) {

        ders1.uygulama2.Yonetici yonetici = new Yonetici("Ali",2500, "IT");
        yonetici.bilgileriGoster();
        yonetici.zamYap(500);
        yonetici.maasHesapla(20);

        KadroluCalisan kadrolu=new KadroluCalisan("Ayse",2000,"muhasebe");
        kadrolu.bilgileriGoster();
        kadrolu.maasHesapla(20);

    }
}
