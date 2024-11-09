import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("boyunuzu girin metre");
        float boy = scan.nextFloat();


        System.out.println("Kilonuzu girin ");
        float kilo = scan.nextFloat();

        float bki = boy / kilo * kilo;

        if (bki < 18.5){
            System.out.println("Kilonuz Zayıf ");
        }else if (bki >= 18.5 && bki < 25){
            System.out.println("Kilonuz Normal ");
        }else if (bki >= 25 && bki < 30){
            System.out.println("Kilonuz Fazla Kilolu ");
        }else if (bki >= 30 && bki < 35){
            System.out.println("Kilonuz Obezite 1.derece ");
        }else if (bki >= 35 && bki < 40){
            System.out.println("Kilonuz Obezite 2.derece ");
        }else if (bki >= 40){
            System.out.println("Kilonuz Obezite 3.derece ");
        }







    }
}