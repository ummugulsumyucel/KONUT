// Daire sınıfı, dairelerin özelliklerini ve karşılaştırma işlemlerini içerir.
public class Daire implements Comparable<Daire> {
    int daireNumarasi;
    String adres;

    public Daire(String adres, int daireNumarasi) {
        this.adres = adres;
        this.daireNumarasi = daireNumarasi;
    }

    public void bilgileriGoster() {
        System.out.println("Daire: " + daireNumarasi);
        System.out.println("Adres: " + adres);
    }

    @Override
    public int compareTo(Daire digerDaire) {
        return Integer.compare(this.daireNumarasi, digerDaire.daireNumarasi);
    }
}