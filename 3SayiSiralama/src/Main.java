import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner yenu = new Scanner(System.in);



        System.out.println("A sayısını giriniz: ");
        a = yenu.nextInt();

        System.out.println("B sayısını giriniz: ");
        b = yenu.nextInt();

        System.out.println("C sayısını giriniz: ");
        c = yenu.nextInt();

        if ( a > b && b > c){
            System.out.println("Sayıların Sırası");
            System.out.print(" a > b > c ");

        }else if(b >a && a > c){
            System.out.println("Sayıların Sırası");
            System.out.print(" b > a > c ");

        }else if(c > b && b > a){
            System.out.println("Sayıların Sırası");
            System.out.print(" c > b > a ");

        }
    }
}