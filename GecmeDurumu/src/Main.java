import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turk, fizik, kimya, biyoloji, tarih, hesap;


        System.out.println("Ders notları durumu makinesi: ");


        Scanner yenu = new Scanner(System.in);


        System.out.println("mat notu giriniz: ");
        mat = yenu.nextInt();

        System.out.println("turkçe notu giriniz: ");
        turk = yenu.nextInt();

        System.out.println("fizik notu giriniz: ");
        fizik = yenu.nextInt();

        System.out.println("kimya notu giriniz: ");
        kimya = yenu.nextInt();

        System.out.println("biyoloji notu giriniz: ");
        biyoloji = yenu.nextInt();


        System.out.println("tarih notu giriniz: ");
        tarih = yenu.nextInt();


        hesap = (mat + turk + fizik + kimya + biyoloji + tarih) / 6;

        if (hesap >= 55 && hesap < 101) {
            System.out.println(("sınıfı geçtiniz ortalamanız:  " + hesap));
        } else if (hesap > 0 && hesap < 55) {
            System.out.println(("sınıfta kaldınız ortalamanız:  " + hesap));
        }
    }
}