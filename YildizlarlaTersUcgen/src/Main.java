import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Basamak değeri");
        int a = scan.nextInt();


        for (int i = a ; i >= 0 ; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}