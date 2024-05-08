import java.util.ArrayList;

public class IsletmeSahibi implements Finans{
    private static IsletmeSahibi instance;
    private String kullaniciAdi;
    private String sifre;
    private static ArrayList<String> isletmeSahibiMesaj;

    private IsletmeSahibi(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        isletmeSahibiMesaj = new ArrayList<>();
    }

    public static IsletmeSahibi getInstance(String kullaniciAdi, String sifre) {
        if (instance == null) {
            instance = new IsletmeSahibi(kullaniciAdi, sifre);
        }
        return instance;
    }

    @Override
    public void abonelikonay() {
        Muhasebe.setOnay(true);//Şuan onaya her zaman açık
    }
    public void raporOlustur(){
        IsletmeSahibi.getIsletmeSahibiMesaj().add("Şirketteki Toplam Para = "+ Muhasebe.getToplamPara());
    }
    public void sikayetleriListele(){
        for (String sikayet : Mudur.getSikayetler()) {
            System.out.println(sikayet);
        }
    }
    public void mesajlariListele(){
        for (String mesaj : isletmeSahibiMesaj) {
            System.out.println(mesaj);
        }
    }




    //Getter and Setter
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public static ArrayList<String> getIsletmeSahibiMesaj() {
        return isletmeSahibiMesaj;
    }

    public static void setIsletmeSahibiMesaj(ArrayList<String> isletmeSahibiMesaj) {
        IsletmeSahibi.isletmeSahibiMesaj = isletmeSahibiMesaj;
    }
}
