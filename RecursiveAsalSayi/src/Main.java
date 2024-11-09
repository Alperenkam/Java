import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int sayi = scan.nextInt();

        if (asalMi(sayi,2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    public static boolean asalMi(int sayi, int i) {
        if (sayi <= 2) {
            if (sayi == 2) {
                return true;
            } else {
                return false;
            }
        }

        if (sayi % i == 0) {
            return false;
        }

        if (i * i > sayi) {
            return true;
        }

        return asalMi(sayi, i + 1);
    }
}