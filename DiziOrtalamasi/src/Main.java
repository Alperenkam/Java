public class Main {
    public static void main(String[] args) {

        int []sayilar = {10,20,30,40,50,60};
        int Min = sayilar[0];
        int Maks = sayilar[0];
        int toplam = 0;


        for (int i= 0 ; i < sayilar.length ; i++) {
            toplam += sayilar[i];

            if (sayilar[i] < Min) {
                Min = sayilar[i];

            } else if (sayilar[i] > Maks) {
                Maks = sayilar[i];
            }
        }
        System.out.println("En kücük sayi " +Min);
        System.out.println("En büyük sayi " +Maks);
        System.out.println("Ortalamasi " + toplam /sayilar.length);


    }
}