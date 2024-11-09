import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, faktor = 1;

        System.out.println("Sayı giriniz ");
        Scanner yenu = new Scanner(System.in);

        sayi = yenu.nextInt();

        for (int i = 1; i < sayi; i++) {
            faktor = (faktor * (i + 1));
        }

        System.out.println("faktöryel sonucu = " + faktor);


    }
}