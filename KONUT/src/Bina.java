import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Bina {
    String adres;
    int katSayisi;
    List<Daire> daireler;

    public Bina(String adres, int katSayisi) {
        this.adres = adres;
        this.katSayisi = katSayisi;
        this.daireler = new ArrayList<>();
    }

    public void daireEkle(Daire daire) {
        daireler.add(daire);
        Collections.sort(daireler);
    }

    public void bilgileriGoster() {
        System.out.println("Bina Adresi: " + adres);
        System.out.println("Kat Sayısı: " + katSayisi);
        for (Daire daire : daireler) {
            daire.bilgileriGoster();
            System.out.println("---------------");
        }
    }
}
