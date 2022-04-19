package nb.ders6;


public class MusteriliSiparis extends Siparis {

    private Musteri musteri;

    public MusteriliSiparis(int siparisNo, Musteri musteri) {
        super(siparisNo);
        this.musteri=musteri;
    }

    public String siparisGoruntule(){
        return musteri.getAd() +" "+
                musteri.getSoyad() +" "+
                this.getSiparisNo() +" "+
                super.toString();

    }

    @Override
    public String toString() {
        return "MusteriliSiparis{" +
                "musteri=" + musteri +
                "} " + super.toString();
    }
}
