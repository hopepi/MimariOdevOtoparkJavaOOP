import java.util.Scanner;

public class AbonelikFactory {
    private Scanner scanner = new Scanner(System.in);

    public Abonelik Abonelikolustur(String abonelikTuru) {
        boolean muhasebeOnay = true;

        if (muhasebeOnay) {
            System.out.println("Arac turunuzu giriniz:");
            String cevap = scanner.next();

            if (abonelikTuru.equalsIgnoreCase("aylik")) {
                return olusturAylikAbonelik(cevap);
            } else if (abonelikTuru.equalsIgnoreCase("yillik")) {
                return olusturYillikAbonelik(cevap);
            } else {
                System.out.println("Hatalı giriş");
                return null;
            }
        } else {
            System.out.println("Maalesef Otoparkta kapasite kalmadığı için muhasebe tarafından talebiniz ret edilmiştir");
            return null;
        }
    }

    // Aylik abonelik nesnesi oluşturma metodu
    private Abonelik olusturAylikAbonelik(String cevap) {
        if (cevap.equalsIgnoreCase("binek")) {
            return new Abonelik("aylik", 100);
        } else if (cevap.equalsIgnoreCase("buyuk")) {
            return new Abonelik("aylik", 150);
        } else {
            System.out.println("Hatalı arac turu");
            return null;
        }
    }

    // Yillik abonelik nesnesi oluşturma metodu
    private Abonelik olusturYillikAbonelik(String cevap) {
        if (cevap.equalsIgnoreCase("binek")) {
            return new Abonelik("yillik", 1000);
        } else if (cevap.equalsIgnoreCase("buyuk")) {
            return new Abonelik("yillik", 1500);
        } else {
            System.out.println("Hatalı arac turu");
            return null;
        }
    }
}