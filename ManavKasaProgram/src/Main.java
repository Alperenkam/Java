import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double a, b, c, d, e, sonuc;


        Scanner yenu = new Scanner(System.in);

        System.out.println("Elma Adetini Giriniz: ");
        a = yenu.nextInt();

        System.out.println("Armut Adetini Giriniz: ");
        b = yenu.nextInt();

        System.out.println("Domates Adetini Giriniz: ");
        c = yenu.nextInt();

        System.out.println("Muz Adetini Giriniz: ");
        d = yenu.nextInt();

        System.out.println("Patlıcan Adetini Giriniz: ");
        e = yenu.nextInt();


        sonuc = (a * elma) + (b * armut) + (c * domates) + (d * muz) + (e * patlıcan);
        System.out.println("Alışveriş Fiyatı: " + sonuc);

    }
}