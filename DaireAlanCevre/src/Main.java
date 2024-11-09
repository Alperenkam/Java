import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ycap,alan,cevre;

        System.out.println("yarıcap giriniz: 5 ");
        Scanner yenu = new Scanner(System.in);


        ycap = yenu.nextInt();
        alan = 3*ycap * ycap;
        System.out.println("alanımız "+ alan);

        cevre = 2*(ycap *3);
        System.out.println("çevremiz "+cevre);


    }
}