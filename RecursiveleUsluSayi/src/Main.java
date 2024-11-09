import java.util.Scanner;

public class Main {
    static int uslusayıdegeri(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Üssü Alınacak Sayıyı Girin :");
        int x = inp.nextInt();
        System.out.println("Üs Alıancak Değer : ");
        int y = inp.nextInt();

        System.out.println("Sonuç : " + uslusayıdegeri(x, y));

    }
}