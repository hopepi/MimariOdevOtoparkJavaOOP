public class GuvenlikGorevlisi {
    private String ad;
    private String soyad;
    private String TCKimlik;


    public GuvenlikGorevlisi(String ad, String soyad, String TCKimlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.TCKimlik = TCKimlik;
    }
    public void musteriBilgileriSorgula(Musteri musteri) {
        System.out.println("Müşteri Adı: " + musteri.getAd());
        System.out.println("Müşteri Soyadı: " + musteri.getSoyad());
        System.out.println("Müşteri TCKimlik No: " + musteri.getTckNo());
        System.out.println("Müşteri Abonelik Türü: " + musteri.getAbonelikTuru().getAbonelikTuru());
    }
    public void aracBilgileriSorgula(Musteri musteri) {
        if (!musteri.getPlakaNo().isEmpty())
            System.out.println("Araç Plaka No: " + musteri.getPlakaNo());
        else
            System.out.println("Müşteriye ait bir abonelik veya araç bulunamadı");
        return;
    }
    public void guvenlikIhlaliKayitAltinaAl(String ihlalBilgisi) {
        IsletmeSahibi.getIsletmeSahibiMesaj().add("Güvenlik İhlali Kaydedildi: " + ihlalBilgisi);
        System.out.println("Güvenlik İhlali Kaydedildi: " + ihlalBilgisi);
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

    public String getTCKimlik() {
        return TCKimlik;
    }

    public void setTCKimlik(String TCKimlik) {
        this.TCKimlik = TCKimlik;
    }
}
