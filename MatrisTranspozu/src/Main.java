import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dizinin satır boyutunu giriniz ");
        int satir = scan.nextInt();

        System.out.println("Dizinin sütun boyutunu giriniz ");
        int sutun = scan.nextInt();

        int[][] dizi = new int[satir][sutun];
        int[][] diziTranspozu = new int[sutun][satir];


        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Dizinin " + (i+1) + ". satır " + (j+1) + ". sütun elemanını giriniz:");
                dizi[i][j] = scan.nextInt();
            }
        }


        System.out.println("Dizi:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                diziTranspozu[j][i] = dizi[i][j];
                System.out.print(dizi[i][j] + " ");

            }
            System.out.println();
        }



        System.out.println("Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(diziTranspozu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
