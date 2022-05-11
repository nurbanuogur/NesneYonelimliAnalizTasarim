package nb.ders8;
class Sayfa{
    private int sayfaNumarasi;
    private String icerik;

    public Sayfa(int sayfaNumarasi, String icerik) {
        this.sayfaNumarasi = sayfaNumarasi;
        this.icerik = icerik;
    }

    public int getSayfaNumarasi() {
        return sayfaNumarasi;
    }

    public String getIcerik() {
        return icerik;
    }

    @Override
    public String toString() {
        return "Sayfa{" +
                "sayfaNumarasi=" + sayfaNumarasi +
                ", icerik='" + icerik + '\'' +
                '}';
    }
}
