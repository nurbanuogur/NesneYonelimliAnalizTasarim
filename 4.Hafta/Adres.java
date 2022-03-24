package ders4.lab;

public class Adres {

    private int id;
    private String adresSatiri;
    private String il;

    public Adres(int id, String adresSatiri, String il) {
        this.id=id;
        this.adresSatiri = adresSatiri;
        this.il = il;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresSatiri() {
        return adresSatiri;
    }

    public void setAdresSatiri(String adresSatiri) {
        this.adresSatiri = adresSatiri;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "adresSatiri='" + adresSatiri + '\'' +
                ", il='" + il + '\'' +
                '}';
    }
}