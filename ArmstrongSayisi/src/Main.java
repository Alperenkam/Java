import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Girin : ");

        int sayi = input.nextInt();
        int bassayisi = 0,basdegeri,degisensayi = sayi,baspow,sonuc=0;

        while (0 != degisensayi) {

            degisensayi /= 10;
            bassayisi++;

        }
        degisensayi = sayi;
        while (degisensayi != 0 ) {
            basdegeri = degisensayi % 10;
            baspow = 1;
            for (int i = 1; i <= bassayisi; i++) {
                baspow *= basdegeri;
            }
            sonuc += baspow;
            degisensayi /= 10;

        }
        if (sonuc==sayi) {
            System.out.println(sayi + " Bir Armstrong Sayısıdır");
        }
        else {
            System.out.println(sayi + "Bir Armstrong Sayısı Değildir.");
        }
    }
}