public class ParkGorevlisi {
    private String ad;
    private String soyad;
    private String TCkimlik;

    public ParkGorevlisi(String ad, String soyad, String TCkimlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.TCkimlik = TCkimlik;
    }

    public void dolulukOraniniTakipEtAcik(AcikOtopark otoparkAcik) {
        int dolulukOrani = otoparkAcik.dolulukKontrol();
        System.out.println("Açık Otopark Boş kapasite: " + dolulukOrani);
    }

    public void dolulukOraniniTakipEtKapali(KapaliOtopark otoparkKapali) {
        int dolulukOrani = otoparkKapali.dolulukKontrol();
        System.out.println("Kapalı Otopark Boş kapasite: " + dolulukOrani);
    }

    public void girisYap() {
        System.out.println("test");
    }

    public void cikisYap() {
        System.out.println("test");
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

    public String getTCkimlik() {
        return TCkimlik;
    }

    public void setTCkimlik(String TCkimlik) {
        this.TCkimlik = TCkimlik;
    }
}
