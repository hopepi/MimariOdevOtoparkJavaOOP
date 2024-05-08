import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Builder deseni kullanarak Musteri nesnesi oluşturma
        Musteri musteri = new Musteri.Builder("John", "Doe", "34ABC123", new Abonelik("yillik", 100))
                .tckNo("1234567890")
                .adres("Istanbul, Turkey")
                .telefon("123456789")
                .email("john.doe@example.com")
                .build();

        // Musteri bilgilerini yazdırma
        AbonelikFactory abonelikFactory = new AbonelikFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Abonelik türünü seçiniz (aylik/yillik):");
        String abonelikTuru = scanner.next();

        Abonelik abonelik = abonelikFactory.Abonelikolustur(abonelikTuru);

        if (abonelik != null) {
            System.out.println("Oluşturulan Abonelik Bilgileri:");
            System.out.println("Abonelik Türü: " + abonelik.getAbonelikTuru());
            System.out.println("Ücret: " + abonelik.getUcret());
        } else {
            System.out.println("Abonelik oluşturma işlemi başarısız.");
        }

        scanner.close();
    }
}