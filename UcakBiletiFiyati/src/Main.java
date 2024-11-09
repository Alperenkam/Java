import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int para, mesafe, yas, yolTipi, kmUcret = 2;


        Scanner scan = new Scanner(System.in);

        System.out.println("Gidiceğiniz mesafeyi giriniz km");
        mesafe = scan.nextInt();

        System.out.println("Yaşınızı giriniz");
        yas = scan.nextInt();

        System.out.println("Yol tipinizi giriniz  tek yön(1)   gidiş dönüş(2)");
        yolTipi = scan.nextInt();


        para = mesafe * kmUcret;
        if (yas > 0 && yas < 12) {


            if (yolTipi == 1) {
                System.out.println("Yol ücretiniz " + para / 2);
            } else if (yolTipi == 2) {
                System.out.println("Yol ücretiniz " + (para / 2) * 4 / 5);
            }


        } else if (yas >= 12 && yas < 65) {


            if (yolTipi == 1) {
                System.out.println("Yol ücretiniz " + para * 9 / 10);
            } else if (yolTipi == 2) {
                System.out.println("Yol ücretiniz " + (para * 9 / 10) * 4 / 5);
            }


        } else if (yas >= 65) {

            if (yolTipi == 1) {
                System.out.println("Yol ücretiniz " + para * 7 / 10);
            } else if (yolTipi == 2) {
                System.out.println("Yol ücretiniz " + (para * 7 / 10) * 4 / 5);
            }
        }
    }
}