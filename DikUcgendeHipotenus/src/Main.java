import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.kenarı girin");
        int a = scan.nextInt();

        System.out.println("2.kenarı girin");
        int b = scan.nextInt();

        System.out.println("Hipotenusumuz " + Math.sqrt(a*a + b*b));

    }
}