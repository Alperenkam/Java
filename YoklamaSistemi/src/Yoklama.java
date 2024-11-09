public class Yoklama {
    String adi;
    String soyadi;
    String dersAdi;
    int devamsizDurum;

    Yoklama(String adi, String soyadi, String dersAdi, int devamsizDurum) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.dersAdi = dersAdi;
        this.devamsizDurum = devamsizDurum;

    }


    void print() {
        System.out.println("Adı                  : " + adi);
        System.out.println("Soyadı               : " + soyadi);
        System.out.println("Dersi                : " + dersAdi);
        System.out.println("Devamsızlık          : " + devamsizDurum);
    }
}
