import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, hesap = 1;

        System.out.println("Üslü Sayı Hesabı");
        Scanner yenu = new Scanner(System.in);

        System.out.println("Üslü Sayı tabanını giriniz");
        a = yenu.nextInt();

        System.out.println("Üslü Sayı kuvvetini giriniz");
        b = yenu.nextInt();


        for (int i = 0; i < b; i++) {
            hesap *= a;
        }
        System.out.println("Üslü sayı sonucu = " + hesap);
    }
}