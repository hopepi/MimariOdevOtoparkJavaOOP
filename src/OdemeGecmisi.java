import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OdemeGecmisi {

    private static OdemeGecmisi instance;
    private Map<String, List<String>> odemeGecmisi;

    private OdemeGecmisi() {
        odemeGecmisi = new HashMap<>();
    }

    public static synchronized OdemeGecmisi getInstance() {
        if (instance == null) {
            instance = new OdemeGecmisi();
        }
        return instance;
    }

    public void odemeEkle(String tckNo, String odemeDetay) {
        List<String> odemeler = odemeGecmisi.get(tckNo);
        if (odemeler == null) {
            odemeler = new ArrayList<>();
            odemeGecmisi.put(tckNo, odemeler);
        }
        odemeler.add(odemeDetay);
    }

    public void odemeGecmisiGoruntule(String tckNo){
        List<String> odemeler = odemeGecmisi.get(tckNo);
        if (odemeler != null) {
            for (String odeme : odemeler) {
                System.out.println(odeme);
            }
        } else {
            System.out.println("Belirtilen TCK No'ya ait ödeme geçmişi bulunamadı.");
        }
    }


}
