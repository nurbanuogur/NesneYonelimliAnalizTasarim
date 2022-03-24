package ders4.lab;

public class Musteri extends Kisi {

    private String telefonNo;
    private Adres isAdresi;

    public Musteri(int id, String ad, String soyad, Adres evAdresi, String telefonNo, Adres isAdresi) {
        super(id,ad,soyad,evAdresi);
        this.telefonNo = telefonNo;
        this.isAdresi = isAdresi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    @Override
    public String toString() {
        return super.toString()+","+telefonNo+","+isAdresi.getIl();

    }
}