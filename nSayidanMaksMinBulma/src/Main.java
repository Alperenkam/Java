import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int adet;
        while (true) {
            System.out.println("Kaç sayı giriceksiniz ");
            adet = scan.nextInt();

            if (adet <= 0) {
                System.out.println("Lütfen pozitif adet giriniz ");
            } else {
                break;
            }
        }

        int[] sayi = new int[adet];

        for (int i = 0; i < adet; i++) {
            while (true) {
                System.out.println((i + 1) + ". sayıyı girin: ");
                try {
                    sayi[i] = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Lütfen bir sayı girin.");
                    scan.next(); // hatalı girişi temizle
                }
            }
        }

        int max = sayi[0];

        for (int i = 1; i < adet; i++) {
            if (sayi[i] > max) {
                max = sayi[i];
            }
        }

        System.out.println("En büyük sayı: " + max);
    }
}