public class Main {
    public static void main(String[] args) {
        int n = 10;
        long[] sayi = new long[n];

        sayi[0] = 0;
        sayi[1] = 1;


        for (int i = 2; i < n; i++) {
            sayi[i] = sayi[i - 1] + sayi[i - 2];
        }
        System.out.println("Fibonacci dizisi");
        for (int i = 0; i < n; i++) {

            System.out.print(" " + sayi[i]);
        }
    }
}