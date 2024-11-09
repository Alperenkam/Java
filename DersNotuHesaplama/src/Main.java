import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik, kimya, mat, biyoloji, tarih;

        Scanner yenu = new Scanner(System.in);


        System.out.print("fizik notu giriniz ");
        fizik = yenu.nextInt();

        System.out.print("kimya giriniz  ");
        kimya = yenu.nextInt();

        System.out.print("mat giriniz   ");
        mat = yenu.nextInt();

        System.out.print("biyo  giriniz ");
        biyoloji = yenu.nextInt();

        System.out.print("tarih giriniz ");
        tarih = yenu.nextInt();

        int toplam = (fizik + kimya + mat + biyoloji + tarih);
        double sonuc = toplam / 5;

        System.out.println("ortlamanız " + sonuc);


        if (sonuc < 60) {
            System.out.println("kaldınız ");
        } else if (sonuc >= 60) {
            System.out.println("geçtiniz ");
        }
    }
}