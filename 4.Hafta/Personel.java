package ders4.lab;


public class Personel extends Kisi {

    private int sicilNO;
    private String bolum;

    public Personel(int id,String ad, String soyad, Adres evAdresi, int sicilNo, String bolum) {
        super(id,ad, soyad, evAdresi);
        this.sicilNO=sicilNo;
        this.bolum=bolum;

    }

    public int getSicilNO() {
        return sicilNO;
    }

    public String getBolum() {
        return bolum;
    }

    public void setSicilNO(int sicilNO) {
        this.sicilNO = sicilNO;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return super.toString()+","+bolum;
    }
}