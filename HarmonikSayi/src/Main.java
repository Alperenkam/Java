import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hesap = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        double a = scan.nextDouble();

        for (double i = 1 ; i <= a ; i++){
            hesap += 1.0/i;

        }
        System.out.println("sonuc " +hesap);


    }
}