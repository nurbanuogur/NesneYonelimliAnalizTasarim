package nb.ders8;
public class KutuphanedekiKitap extends Kitap{

    private Kutuphane kutuphane;

    public KutuphanedekiKitap(String baslik, Kutuphane kutuphane) {
        super(baslik);
        this.kutuphane = kutuphane;
    }

}
