import java.util.Scanner;
import java.lang.Math;
import java.lang.ArithmeticException;

public class Main {

    static  int  Topla(int a,int b){
        return a+b;

    }static  int Cikarma(int a,int b){
        return a-b;

    }static  int Carpma(int a,int b){
       return  a*b;

    }static  int Bolme(int a,int b){
        try {
            return a / b;

        }catch (ArithmeticException e){

            System.out.println("0 Girilimez BÖLÜNEMEZ  hata adı = " + e);
        }

        return 0;

    }static  int KareAl(int a){
        return a*a;

    }static  int AlanCevre(int a,int b){
       return a*b;

    }static  int UsluSayi(int a,int b){
        return (int) Math.pow(a,b);

    }static  int Hipotenus(int a,int b){
        return (int) Math.sqrt(a * a + b * b);


    }




    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while(true) {

            System.out.println();
            String  menu =  "1- Toplama \n" +
                            "2- Çıkarma \n" +
                            "3- Çarpma  \n"+
                            "4- Bölme   \n" +
                            "5- Kare Alma  \n" +
                            "6- Alan ve Çevre Hesabı \n" +
                            "7- Üslü Sayı \n" +
                            "8- Hipotenüs Hesabı \n" +
                            "9- Çıkış \n";

            System.out.println(menu);

            String Secim = scan.next();

            switch (Secim){
                case "1":
                    System.out.println("İlk sayıyı Girin");

                    int a = scan.nextInt();
                    System.out.println("İkinci sayıyı Girin");

                    int b = scan.nextInt();
                    System.out.println("Sayıların toplamı = " + Topla(a, b));

                    break;


                case "2":
                    System.out.println("İlk sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("İkinci sayıyı Girin");
                    b = scan.nextInt();

                    System.out.println("Sayıların toplamı = " + Cikarma(a, b));
                    break;


                case "3":
                    System.out.println("İlk sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("İkinci sayıyı Girin");
                    b = scan.nextInt();

                    System.out.println("Sayıların toplamı = " + Carpma(a, b));
                    break;


                case "4":
                    System.out.println("İlk sayıyı Girin");

                    a = scan.nextInt();
                    System.out.println("İkinci sayıyı Girin");

                    b = scan.nextInt();
                    System.out.println("Sayıların toplamı = " + Bolme(a, b));
                    break;


                case "5":

                    System.out.println("Sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("Sayıların karesi = " + KareAl(a));
                    break;


                case "6":

                    System.out.println("İlk sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("İkinci sayıyı Girin");
                    b = scan.nextInt();

                    System.out.println("Alan ve Çevre Hesabı = " + AlanCevre(a, b));
                    break;


                case "7":
                    System.out.println("ÜS sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("TABAN sayıyı Girin");
                    b = scan.nextInt();

                    System.out.println("Üslü sayı = " + UsluSayi(a,b));
                    break;


                case "8":
                    System.out.println("İlk sayıyı Girin");
                    a = scan.nextInt();

                    System.out.println("İkinci sayıyı Girin");
                    b = scan.nextInt();


                    System.out.println("Hipotenüs Hesabı = " + Hipotenus(a,b));
                    break;



                case "9":
                    break;


                default:
                    System.out.println("1-9 arası bir rakam giriniz");
                    break;
            }
        }
    }
}