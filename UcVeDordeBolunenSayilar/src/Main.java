import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sayi, toplam = 0, adet = 0;

        System.out.print("bir sayi giriniz: ");
        Scanner yenu = new Scanner(System.in);

        sayi = yenu.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                toplam += i;
                adet++;


            }
        }
        System.out.println("sonuc = " + (toplam / adet));


    }
}
