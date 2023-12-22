
import java.util.ArrayList;
import java.util.List;

public class EvSahibi {
        String ad;
        String soyad;
        List<Daire> sahipDaireler;

public EvSahibi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.sahipDaireler = new ArrayList<>();
        }

public void daireEkle(Daire daire) {
        sahipDaireler.add(daire);
        }

public void bilgileriGoster() {
        System.out.println("Ev Sahibi Bilgileri:");
        System.out.println("Adı Soyadı: " + ad + " " + soyad);
        System.out.println("Sahip Olduğu Daire Numarası:");
        for (Daire daire : sahipDaireler) {
        daire.bilgileriGoster();
        System.out.println("---------------");
        }
        }
        }
