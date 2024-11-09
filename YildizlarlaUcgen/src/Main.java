import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Basamak değeri");
        int a = scan.nextInt();


        for (int i = 0 ; i<=a ; i++) {
            for (int j = 0; j <= (a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}