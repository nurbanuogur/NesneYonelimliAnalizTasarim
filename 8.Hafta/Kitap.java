package nb.ders8;
import java.util.ArrayList;
public class Kitap {
    private String baslik;
    private int toplamSayfaSayisi;
    private ArrayList<Yazar> yazarlar;
    private ArrayList<Sayfa> sayfalar;

    public Kitap(String baslik) {
        this.baslik = baslik;
        this.toplamSayfaSayisi = 0;
        this.yazarlar = new ArrayList<Yazar>();
        this.sayfalar=new ArrayList<Sayfa>();
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public ArrayList<Yazar> getYazarlar() {
        return yazarlar;
    }

    public int getToplamSayfaSayisi() {
        return toplamSayfaSayisi;
    }

    public void sayfaEkle(Sayfa sayfa){
        sayfalar.add(sayfa);
        toplamSayfaSayisi++;
    }
    public void yazarEkle(Yazar yazar){
        yazarlar.add(yazar);
    }
    public Sayfa sayfayiGetir(int sayfaNo){
        Sayfa sayfa= sayfalar
                .stream()
                .filter(item -> item.getSayfaNumarasi()==sayfaNo)
                .findFirst()
                .orElse(null);
        return  sayfa;
    }
    public void tumSayfalariYazdir() {
        sayfalar.forEach(item -> System.out.println(item));
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "baslik='" + baslik + '\'' +
                ", toplamSayfaSayisi=" + toplamSayfaSayisi +
                ", yazarlar=" + yazarlar +
                ", sayfalar=" + sayfalar +
                '}';
    }
}
