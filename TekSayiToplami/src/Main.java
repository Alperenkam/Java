import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        System.out.print("Bir sayı giriniz; ");
        Scanner yenu = new Scanner(System.in);
        sayi = yenu.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 2 == 1) {
                toplam += i;
            }
        }
        System.out.println("tek sayı toplamı = " + toplam);

    }
}