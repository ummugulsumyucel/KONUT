public class Kiraci {
    String ad;
    String soyad;
    EvSahibi evSahibi;
    public Kiraci(String ad, String soyad, EvSahibi evSahibi) {
        this.ad = ad;
        this.soyad = soyad;
        this.evSahibi = evSahibi;
    }

    public void bilgileriGoster() {
        System.out.println("Kiracı Bilgileri:");
        System.out.println("Adı Soyadı: " + ad + " " + soyad);

        evSahibi.bilgileriGoster();
    }
}