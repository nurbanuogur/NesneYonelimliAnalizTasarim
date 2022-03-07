public class Hesaplar
{

    public int getIlkSayi() {
        return ilkSayi;
    }

    public void setIlkSayi(int ilkSayi) {
        this.ilkSayi = ilkSayi;
    }

    public int getIkinciSayi() {
        return ikinciSayi;
    }

    public void setIkinciSayi(int ikinciSayi) {
        this.ikinciSayi = ikinciSayi;
    }

    private int ilkSayi;
    private int ikinciSayi;

      public Hesaplar(int ilk, int ikinci) {
        this.ilkSayi = ilk;
        this.ikinciSayi = ikinci;
        }

    public double Toplama(){
        return ilkSayi+ikinciSayi;
    }
    public double Cikarma(){
        return ilkSayi-ikinciSayi;
    }
    public double Bolme(){
        return ilkSayi/ikinciSayi;
    }
    public double Carpma(){
        return ilkSayi*ikinciSayi;
    }
}
