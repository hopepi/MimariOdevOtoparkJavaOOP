import java.util.ArrayList;

public class KapaliOtopark extends Otopark {

    private static KapaliOtopark instance;
    private int guncelKapasite = 50;
    private static ArrayList<String> OtoparkMusteriListesiKapali = new ArrayList<>();

    private ParkGorevlisi parkGorevlisiKapali;
    private GuvenlikGorevlisi guvenlikkapali;




    private KapaliOtopark(int kapasite) {

        super(kapasite);
        parkGorevlisiKapali = new ParkGorevlisi("asd", "ada", "553545");
        guvenlikkapali = new GuvenlikGorevlisi("asd", "ada", "553545");

    }

    public static KapaliOtopark getInstance() {
        if (instance == null) {
            instance = new KapaliOtopark(50);
        }
        return instance;
    }
    @Override
    public void girisYap(Musteri musteri) {
        if (!musteri.getAbonelikTuru().getAbonelikTuru().equalsIgnoreCase("yok") && guncelKapasite>=50){
            System.out.println("Otoparka girisiniz gerçekleşmiştir");
            OtoparkMusteriListesiKapali.add(musteri.getTckNo());
            guncelKapasite --;

        }else {
            System.out.println("Aboneliğiniz veya otoparkta kapasite bulunamadı");
        }
    }

    @Override
    public void cikisYap(Musteri musteri) {
        for (int i = 0; i < OtoparkMusteriListesiKapali.size(); i++) {
            if (OtoparkMusteriListesiKapali.get(i).equals(musteri.getTckNo())) {
                OtoparkMusteriListesiKapali.remove(i);
                guncelKapasite ++;
                break;
            }
        }
    }



    //getter and setter

    @Override
    public int dolulukKontrol() {
        return guncelKapasite;
    }

    public int getGuncelKapasite() {
        return guncelKapasite;
    }

    public void setGuncelKapasite(int guncelKapasite) {
        this.guncelKapasite = guncelKapasite;
    }

    public static ArrayList<String> getOtoparkMusteriListesiKapali() {
        return OtoparkMusteriListesiKapali;
    }

    public static void setOtoparkMusteriListesiKapali(ArrayList<String> otoparkMusteriListesiKapali) {
        OtoparkMusteriListesiKapali = otoparkMusteriListesiKapali;
    }

    public ParkGorevlisi getParkGorevlisiKapali() {
        return parkGorevlisiKapali;
    }

    public void setParkGorevlisiKapali(ParkGorevlisi parkGorevlisiKapali) {
        this.parkGorevlisiKapali = parkGorevlisiKapali;
    }

    public GuvenlikGorevlisi getGuvenlikkapali() {
        return guvenlikkapali;
    }

    public void setGuvenlikacik(GuvenlikGorevlisi guvenlikacik) {
        this.guvenlikkapali = guvenlikacik;
    }
}
