import java.util.Scanner;

public class Odeme {
    private String odemeYontemi;

    private int cevap;
    private Scanner scanner = new Scanner(System.in);
    private OdemeGecmisi odemeGecmisi = OdemeGecmisi.getInstance();

    public Odeme() {

    }


    public void OdemeYap(Abonelik abonelik,Musteri musteri){
        if (abonelik.getUcret()>0){
            System.out.println("Odeme Yontemini Seçiniz\n" +
                    "1) Peşin :" +
                    "2) Banka havalesi :" +
                    "3) Kredi Karti");
            cevap= scanner.nextInt();
            if (cevap==1){

                System.out.println("Peşin ödemesi yapılmıştır");
                musteri.MesajEkle(musteri.getTckNo(),"Peşin ödemesi yapılmıştır");
                odemeGecmisi.odemeEkle(musteri.getTckNo(),(""+abonelik.getUcret()));
                Muhasebe.setToplamPara(Muhasebe.getToplamPara()+abonelik.getUcret());
                odemeYontemi="Peşin";
            }else if(cevap==2){
                System.out.println("Banka havalesi ödemesi yapılmıştır");
                musteri.MesajEkle(musteri.getTckNo(),"Banka havalesi ödemesi yapılmıştır");
                odemeGecmisi.odemeEkle(musteri.getTckNo(),(""+abonelik.getUcret()));
                Muhasebe.setToplamPara(Muhasebe.getToplamPara()+abonelik.getUcret());
                odemeYontemi="Banka Havalesi";
            }else if (cevap==3){
                System.out.println("Kredi Kartı ödemesi yapılmıştır");
                musteri.MesajEkle(musteri.getTckNo(),"Kredi kartı ödemesi yapılmıştır");
                odemeGecmisi.odemeEkle(musteri.getTckNo(),(""+abonelik.getUcret()));
                Muhasebe.setToplamPara(Muhasebe.getToplamPara()+abonelik.getUcret());
                odemeYontemi="Kredi kartı";
            }else {
                System.out.println("Hatali değer girildi");
            }
        } else{
            System.out.println("Aktif bir borcunuz bulunamadı");
        }
    }




    public String getOdemeYontemi() {
        return odemeYontemi;
    }

    public void setOdemeYontemi(String odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }
}
