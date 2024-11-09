public class Main {

    static String PalindromMu(int sayi) {
        int bolSayi = sayi, tersSayi = 0, SayilarTek;

        while (bolSayi != 0) {
            SayilarTek = bolSayi % 10;

            tersSayi = (tersSayi * 10) + SayilarTek;

            bolSayi /= 10;


            System.out.println("basamak Sayi " +SayilarTek );

            System.out.println("sayi bölünüyor " +bolSayi);

            System.out.println("yeni sayi " +tersSayi +"\n");


        }if (sayi == tersSayi) {
            System.out.println(sayi  + " Palindrom Sayıdır\n ");
        } else {
            System.out.println(sayi  + " Palindrom Sayı değil\n ");

        }
        return ("");
    }


        public static void main (String[]args){
            System.out.println(PalindromMu(404));
        }
    }
