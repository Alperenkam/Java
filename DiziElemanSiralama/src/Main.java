import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz ");
        int boyut = scan.nextInt();
        int[] array = new int[boyut];



        System.out.println("Dizinini elemanlarını giriniz :");
        for (int i = 0; i < boyut; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sıralanmış dizi : ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
