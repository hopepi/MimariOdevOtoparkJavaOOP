import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Musteri {

    private String ad;
    private String soyad;
    private String tckNo;
    private String adres;
    private String telefon;
    private String email;
    private String plakaNo;
    private Abonelik abonelik;
    private static Map<String, ArrayList<String>> mesajGecmisi =new HashMap<>();
    private OdemeGecmisi odemeGecmisi = OdemeGecmisi.getInstance();


    private Musteri(Builder builder) {
        this.ad = builder.ad;
        this.soyad = builder.soyad;
        this.tckNo = builder.tckNo;
        this.adres = builder.adres;
        this.telefon = builder.telefon;
        this.email = builder.email;
        this.plakaNo = builder.plakaNo;
        this.abonelik = builder.abonelik;
    }

    public static class Builder {
        private String ad;
        private String soyad;
        private String tckNo;
        private String adres;
        private String telefon;
        private String email;
        private String plakaNo;
        private Abonelik abonelik;

        public Builder(String ad, String soyad, String plakaNo, Abonelik abonelik) {
            this.ad = ad;
            this.soyad = soyad;
            this.plakaNo = plakaNo;
            this.abonelik = abonelik;
        }

        public Builder tckNo(String tckNo) {
            this.tckNo = tckNo;
            return this;
        }

        public Builder adres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Musteri build() {
            return new Musteri(this);
        }
    }
    public static Map<String, ArrayList<String>> getMesajGecmisi() {
        return mesajGecmisi;
    }

    public static void setMesajGecmisi(Map<String, ArrayList<String>> mesajGecmisi) {
        Musteri.mesajGecmisi = mesajGecmisi;
    }

    public void MesajEkle(String tckNo, String mesaj) {
        ArrayList<String> mesajlar = mesajGecmisi.get(tckNo);
        if (mesajlar == null) {
            mesajlar = new ArrayList<>();
            mesajGecmisi.put(tckNo, mesajlar);
        }
        mesajlar.add(mesaj);
    }

    public void bilgiler() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("TCK No: " + tckNo);
        System.out.println("Adres: " + adres);
        System.out.println("Telefon: " + telefon);
        System.out.println("E-mail: " + email);
        System.out.println("Plaka No: " + plakaNo);
        System.out.println("Abonelik Türü: " + abonelik.getAbonelikTuru());
    }


    public void abonelikdetay(){
        System.out.println("Abonelik Detaylari\n" +
                "Abonelik Turunuz :"+abonelik.getAbonelikTuru()+"\n"+
                "Abonelik Ucretiniz :"+abonelik.getUcret());

    }
    public void mesajlariGoruntule(String tckNo){
        List<String> mesajlar = mesajGecmisi.get(tckNo);
        if (mesajlar != null) {
            for (String mesaj : mesajlar) {
                System.out.println(mesaj);
            }
        } else {
            System.out.println("Belirtilen TCK No'ya ait mesaj bulunamadı.");
        }
    }
    public void odemeGecmisiGoruntule(String tckNo){
        odemeGecmisi.odemeGecmisiGoruntule(tckNo);
    }


    public void otoparkGirisCikisListeleme(String tckNo){
        System.out.println("GİRİŞ ÇIKIŞLAR LİSTELENİYOR (Bunu yapmaya beynim eridi)");
    }
    public void sikayetEkle(String sikayet){
        Mudur.getSikayetler().add(sikayet);
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

    public String getTckNo() {
        return tckNo;
    }

    public void setTckNo(String tckNo) {
        this.tckNo = tckNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public Abonelik getAbonelikTuru() {
        return abonelik;
    }

    public void setAbonelikTuru(Abonelik abonelik) {
        this.abonelik = abonelik;
    }
}
