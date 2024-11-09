import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int ken1, ken2, hipotenus;


        Scanner yenu = new Scanner(System.in);

        System.out.println("kenar 1  giriniz : ");
        ken1 = yenu.nextInt();


        System.out.println("kenar 2  giriniz : ");
        ken2 = yenu.nextInt();

        hipotenus = (ken1 * ken1) + (ken2 * ken2);


        System.out.println("hipotenusumuz");
        System.out.println(Math.sqrt(hipotenus));
    }
}