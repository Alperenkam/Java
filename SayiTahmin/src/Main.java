import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı tahmin oyununa hoş geldiniz");
        System.out.println("Birle on arası bir sayı giriniz");

        int pctahmin = random.nextInt(10);


        int hak = 10;
        while (hak > 0){
            hak--;
            int sayi = scan.nextInt();
            if (sayi ==  pctahmin){
                System.out.println("Sayıyı DOĞRU tahmin ettiniz "+sayi);
                break;
            }else{
                System.out.println("Sayıyı YANLIŞ tahmin ettiniz "+sayi);
            }
        }
    }
}