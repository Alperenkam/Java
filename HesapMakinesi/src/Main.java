import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, hesap;

        System.out.println("Hesap Makinesi");
        Scanner yenu = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        a = yenu.nextInt();

        System.out.println("ikinci sayıyı giriniz: ");
        b = yenu.nextInt();


        System.out.println("Bir İşlem Seçiniz: 1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme ");
        hesap = yenu.nextInt();


        switch (hesap) {
            case 1:
                System.out.println("Toplam = : " + (a + b));
                break;

            case 2:
                System.out.println("Çıkarma = : " + (a - b));
                break;

            case 3:
                System.out.println("Çarpma= : " + (a * b));
                break;

            case 4:
                if (a != 0 || b != 0) {
                    System.out.println("Bölme = : " + (a / b));
                } else {
                    System.out.println("Sayı bölümü 0 bölünemez !!");

                }
                break;

        }
    }
}