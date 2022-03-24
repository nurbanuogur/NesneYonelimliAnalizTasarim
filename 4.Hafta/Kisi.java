package ders4.lab;

public abstract class Kisi {

    private int id;
    private String ad;
    private String soyad;
    private Adres evAdresi;

    public Kisi(int id, String ad, String soyad, Adres evAdresi) {
        this.id=id;
        this.ad = ad;
        this.soyad = soyad;
        this.evAdresi = evAdresi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        return id+","+ad+","+evAdresi.getIl();
    }
}