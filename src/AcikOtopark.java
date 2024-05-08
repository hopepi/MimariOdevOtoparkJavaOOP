import java.util.ArrayList;

public class AcikOtopark extends Otopark{

    private static AcikOtopark instance;
    private int guncelKapasite = 100;
    private static ArrayList<String> OtoparkMusteriListesiAcik = new ArrayList<>();
    private ParkGorevlisi parkGorevlisiacik;
    private GuvenlikGorevlisi guvenlikacik;



    private AcikOtopark(int kapasite) {

        super(kapasite);
        parkGorevlisiacik = new ParkGorevlisi("asd", "ada", "553545");
        guvenlikacik = new GuvenlikGorevlisi("asd", "ada", "553545");
    }

    public static AcikOtopark getInstance() {
        if (instance == null) {
            instance = new AcikOtopark(100); // Kapasite burada belirlenebilir veya parametre olarak alınabilir
        }
        return instance;
    }

    @Override
    public void girisYap(Musteri musteri) {
        if (!musteri.getAbonelikTuru().getAbonelikTuru().equalsIgnoreCase("yok") && guncelKapasite>=50){
            System.out.println("Otoparka girisiniz gerçekleşmiştir");
            OtoparkMusteriListesiAcik.add(musteri.getTckNo());
            guncelKapasite --;

        }else {
            if (guncelKapasite<=0){
                System.out.println("Kapasite bulunamadı");
            }else {
                System.out.println("Kaydınız yok bilet alınıyor");
                OtoparkMusteriListesiAcik.add(musteri.getTckNo());
            }
        }
    }

    @Override
    public void cikisYap(Musteri musteri) {
        for (int i = 0; i < OtoparkMusteriListesiAcik.size(); i++) {
            if (OtoparkMusteriListesiAcik.get(i).equals(musteri.getTckNo())) {
                if (musteri.getAbonelikTuru().getAbonelikTuru().equalsIgnoreCase("yok")){
                    OtoparkMusteriListesiAcik.remove(i);
                    guncelKapasite ++;
                    System.out.println("Tek seferlik biletinizin hakkı dolmuştur ücretiniz alınmıştır gene bekleriz");
                    break;
                }
                OtoparkMusteriListesiAcik.remove(i);
                guncelKapasite ++;
                break;
            }
        }
    }

    @Override
    public int dolulukKontrol() {
        return guncelKapasite;
    }



    //Getter and Setter

    public ParkGorevlisi getParkGorevlisiacik() {
        return parkGorevlisiacik;
    }
    public static ArrayList<String> getOtoparkMusteriListesiAcik() {
        return OtoparkMusteriListesiAcik;
    }

    public static void setOtoparkMusteriListesiAcik(ArrayList<String> otoparkMusteriListesiAcik) {
        OtoparkMusteriListesiAcik = otoparkMusteriListesiAcik;
    }

    public void setParkGorevlisiacik(ParkGorevlisi parkGorevlisiacik) {
        this.parkGorevlisiacik = parkGorevlisiacik;
    }

    public GuvenlikGorevlisi getGuvenlikacik() {
        return guvenlikacik;
    }

    public void setGuvenlikacik(GuvenlikGorevlisi guvenlikacik) {
        this.guvenlikacik = guvenlikacik;
    }
}
