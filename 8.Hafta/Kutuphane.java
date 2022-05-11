package nb.ders8;
import java.util.ArrayList;
import java.util.List;

public class Kutuphane {

    private List<KutuphanedekiKitap> kitaplar;
    private int toplamKitapSayisi;

    public Kutuphane() {
        this.kitaplar = new ArrayList<KutuphanedekiKitap>();
        this.toplamKitapSayisi = 0;
    }

    public List<KutuphanedekiKitap> getKitaplar() {
        return kitaplar;
    }

    public void kitapEkle(KutuphanedekiKitap kitap){
        kitaplar.add(kitap);
        toplamKitapSayisi++;
    }

    @Override
    public String toString() {
        return "Kutuphane{" +
                "kitaplar=" + kitaplar +
                ", toplamKitapSayisi=" + toplamKitapSayisi +
                '}';
    }
}
