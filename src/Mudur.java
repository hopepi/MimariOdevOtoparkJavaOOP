import java.util.ArrayList;

public class Mudur  {
    private static Mudur instance;

    private String ad;
    private String soyad;
    private String tckn;
    private String sifre;
    private static ArrayList<String> sikayetler = new ArrayList<>();

    private Mudur(String ad, String soyad, String tckn, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.tckn = tckn;
        this.sifre = sifre;
    }

    public static Mudur getInstance(String ad, String soyad, String tckn, String sifre) {
        if (instance == null) {
            instance = new Mudur(ad, soyad, tckn, sifre);
        }
        return instance;
    }

    public void raporOlustur(){
        IsletmeSahibi.getIsletmeSahibiMesaj().add("Şirketteki Toplam Para = "+ Muhasebe.getToplamPara());
    }
    public void sikayetleriListele(){
        for (String sikayet : sikayetler) {
            System.out.println(sikayet);
        }
    }


    //Getter and Setter

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public static ArrayList<String> getSikayetler() {
        return sikayetler;
    }

    public static void setSikayetler(ArrayList<String> sikayetler) {
        Mudur.sikayetler = sikayetler;
    }
}
