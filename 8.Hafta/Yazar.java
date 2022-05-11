package nb.ders8;
public class Yazar {
    private String adi;
    private String soyadi;

    public Yazar(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                '}';
    }
}
