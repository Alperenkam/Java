public class Ders {
    String adi;
    String soyadi;
    String dersAdi;
    String telefon;
    String dersKodu;
    String dersKredi;

    Ders(String adi, String soyadi, String dersAdi, String telefon, String dersKodu,String dersKredi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.dersAdi = dersAdi;
        this.telefon = telefon;
        this.dersKodu = dersKodu;
        this.dersKredi = dersKredi ;
    }


    void print() {
        System.out.println("Adı                  : " + adi);
        System.out.println("Soyadı               : " + soyadi);
        System.out.println("Dersi                : " + dersAdi);
        System.out.println("Telefonu             : " + telefon);
        System.out.println("Derskodu             : " + dersKodu);
        System.out.println("DersKredi            : " + dersKredi);


    }
}