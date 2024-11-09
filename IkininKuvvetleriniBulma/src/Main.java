import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz");
        Scanner yenu = new Scanner(System.in);
        int sayi = yenu.nextInt();

        for(int i = 1; i < sayi; i *= 2) {
            System.out.println("2 nin kuvvetleri " + i);
        }

    }
}
