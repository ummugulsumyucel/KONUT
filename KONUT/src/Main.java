//Bu kod  bir konut binası ve ev sahibini temsil etmek için oluşturulan sınıfları içerir.
// Uygulama 3 ev sahibinin sahip olduğu daireleri oluşturur, bu daireleri bir binaya ekler ve daire numaralarına göre sıralar.
// Son olarak ev sahibinin bilgilerini ve binadaki sıralı daireleri ekrana basar.
// Bu uygulama nesneler arasındaki ilişkileri ve temel kullanımı gösterir.

import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        // Bina oluştur
        Bina binam = new Bina("Örnek Adres", 13);

        // Ev Sahibi oluştur
        EvSahibi evSahibim = new EvSahibi("Nilay", "ÜNAL");
        EvSahibi evSahibim1 = new EvSahibi("Sönmez", "ARSLAN");
        EvSahibi evSahibim2 = new EvSahibi("Ömer", "TÜRKER");

        // Daire oluştur ve ev sahibine bağla
        Daire dairem1 = new Daire("Kırklareli Üniversitesi Rektörlüğü Kayalı Kampüsü / KIRKLARELİ", 4);
        Daire dairem2 = new Daire("Kırklareli Üniversitesi Rektörlüğü Kayalı Kampüsü / KIRKLARELİ", 6);
        Daire dairem3 = new Daire("Kırklareli Üniversitesi Rektörlüğü Kayalı Kampüsü / KIRKLARELİ", 7);


        evSahibim.daireEkle(dairem1);
        evSahibim1.daireEkle(dairem2);
        evSahibim2.daireEkle(dairem3);



        // Ev Sahibi'nin sahip olduğu bina ve daireleri göster
        binam.daireEkle(dairem1);
        binam.daireEkle(dairem2);
        binam.daireEkle(dairem3);
        evSahibim.bilgileriGoster();
        evSahibim1.bilgileriGoster();
        evSahibim2.bilgileriGoster();
        System.out.println("---------------");

        // Kiracı oluştur ve ev sahibini bağla
        Kiraci kiracim1 = new Kiraci("Ayşe", "KOCA", evSahibim);
        Kiraci kiracim2 = new Kiraci("Ümmügülsüm", "YÜCEL", evSahibim1);
        Kiraci kiracim3 = new Kiraci("Şebnem", "GÜMÜŞÇÜ", evSahibim2);



        // Kiracı ve ev sahibi bilgilerini göster
        kiracim1.bilgileriGoster();
        kiracim2.bilgileriGoster();
        kiracim3.bilgileriGoster();


        Collections.sort(binam.daireler);
        System.out.println("Daire Numaralarının Sıralaması:");
        for (Daire daire : binam.daireler) {
            daire.bilgileriGoster();


    }
    }

}