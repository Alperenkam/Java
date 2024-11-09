import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("sayı girin");

        int a = scan.nextInt();
        int i ;


        for (i = 0 ; i < 11 ; i++){

            System.out.println(a +"x" +i+ " = "+ (a * i));
        }
    }
}