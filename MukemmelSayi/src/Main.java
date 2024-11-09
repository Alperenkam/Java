import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi girin");
        int toplam = 0;
        int sayi = scan.nextInt();


        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println("sayinin bolenleri " + i);
                toplam += i;
                if (sayi == toplam) {
                    System.out.println(toplam + " Mukemmel Sayi ");
                } else {
                    System.out.println(toplam + " Mukemmel Sayi değil ");
                }


            }
        }
    }
}
