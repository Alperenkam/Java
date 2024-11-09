import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int urunt, sonuc, urunf, kdvli;

        System.out.println("KDV HESAPLAMA ");
        System.out.println("Ürün yiyecek (1) içecek (2) giyecek (3) aksesuar (4):    ");

        Scanner yenu = new Scanner(System.in);
        urunt = yenu.nextInt();

        System.out.println("Ürün fiyatı giriniz: ");
        urunf = yenu.nextInt();

        if (urunt == 1) {
            kdvli = urunf + (urunf * 8 / 100);
            System.out.println("kdvli tutar" + kdvli);

        } else if (urunt == 2) {
            kdvli = urunf + (urunf * 10 / 100);
            System.out.println("kdvli tutar" + kdvli);

        } else if (urunt == 3) {
            kdvli = urunf + (urunf * 9 / 100);
            System.out.println("kdvli tutar" + kdvli);
        } else {
            kdvli = urunf + (urunf * 15 / 100);
            System.out.println("kdvli tutar" + kdvli);
        }


    }
}