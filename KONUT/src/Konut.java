public class Konut extends Daire {
    public Konut(String adres, int daireNumarasi) {
        super(adres, daireNumarasi);
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Konut Bilgisi:");
        super.bilgileriGoster();
    }
}