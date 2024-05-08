public class Muhasebe implements Finans {
    private  static Muhasebe instance;
    private static boolean onay=true;//tüm abonelikler onaylandı
    private String ad;
    private String soyad;
    private String tckn;
    private String sifre;
    private static double ToplamPara = 0;

    public static double getToplamPara() {
        return ToplamPara;
    }

    public static void setToplamPara(double toplamPara) {
        ToplamPara = toplamPara;
    }



    private Muhasebe(String ad, String soyad, String tckn, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.tckn = tckn;
        this.sifre = sifre;
        abonelikonay();
    }

    public static Muhasebe getInstance(String ad, String soyad, String tckn, String sifre) {
        if (instance == null) {
            instance = new Muhasebe(ad, soyad, tckn, sifre);
        }
        return instance;
    }
    public void abonelikonay(){
        onay=true; //her zaman onaya açık şuan
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

    public static boolean getOnay() {
        return onay;
    }
    public static void setOnay(boolean onay) {
        Muhasebe.onay = onay;
    }

}
