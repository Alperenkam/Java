import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe;
        // km cinsinden


        System.out.println(" Gideceğiniz Yerin Kaç KM  Uzaklıkta Olduğunu Giriniz: ");
        Scanner yenu = new Scanner(System.in);
        mesafe = yenu.nextInt();

        if (mesafe < 5) {
            System.out.println("taksimetre ücreti");
            System.out.println((mesafe * 3) + 10);

        } else if (mesafe >= 5 && mesafe < 15) {
            System.out.println("taksimetre ücreti");
            System.out.println((mesafe * 5) + 20);

        } else if (mesafe >= 15 && mesafe < 30) {

            System.out.println("taksimetre ücreti");
            System.out.println((mesafe * 7) + 30);

        } else if (mesafe >= 30) {

            System.out.println("taksimetre ücreti");
            System.out.println((mesafe * 10) + 40);

        }
    }
}