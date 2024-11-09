import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Ders d1 = new Ders("Hakan", "TEMİZ","VERİ YAPILARI","21","201","4");
        Ders d2 = new Ders("Kadri", "DOĞAN","DİFERANSİYEL DENKLEMLER","22","201","4");
        Ders d3 = new Ders("Çağrı", "AKSU","GÖRSEL PROGRAMLAMA","23","203","4");

        Yoklama y1 = new Yoklama("Hakan","TEMİZ","VERİ YAPILARI",4);
        Yoklama y2 = new Yoklama("Kadri","DOĞAN","DİFERANSİYEL DENKLEMLER ",4);
        Yoklama y3 = new Yoklama("Çağrı","AKSU","GÖRSEL PROGRAMLAMA",4);


        System.out.println("Sınıf düzeyinizi giriniz ");
        Scanner scan = new Scanner(System.in);

        /*
        Okul maili ve şifresiyle yapıablilir bu kısım


        System.out.println("Okul malinizi giriniz ");
        String okulMail = scan.next();

        System.out.println("Şifrenizi giriniz");
        String okulSifre = scan.next();
        */


        int sinif = scan.nextInt();


        if (sinif == 2) {
            String menu1 = """
                    1- Ders Görüntüle \s
                    2- Hoca Görüntüle \s
                    3- Ders Kredisi   \s
                    4- Yoklama Durumu \s
                    """;

            System.out.println(menu1);
            String sec = scan.next();

            if (Objects.equals(sec, "1")) {
                System.out.println("Zorunlu Dersleriniz Aşağıdaki Gibidir ");

                Ders d4 = new Ders("Hakan", "TEMİZ", "VERİ YAPILARI", "21", "101", "4");
                System.out.println("\n");
                d4.print();

                Ders d5 = new Ders("Kadri", "DOĞAN", "DİFERANSİYEL DENKLEMLER", "22", "101", "4");
                System.out.println("\n");
                d5.print();

                Ders d6 = new Ders("Çağrı", "AKSU", "GÖRSEL PROGRAMLAMA", "23", "101", "4");
                System.out.println("\n");
                d6.print();


            } else if (Objects.equals(sec, "2")) {
                System.out.println("HOCALARIMIZ \n" + d1.adi + " " + d1.soyadi + "  ==  " + d1.dersAdi +"\n" +
                                                      d2.adi + " " + d2.soyadi + "  ==  " + d2.dersAdi + "\n" +
                                                      d3.adi + " " + d3.soyadi + "  ==  " + d3.dersAdi);


            } else if (Objects.equals(sec, "3")) {
                System.out.println("Ders KREDİLERİ \n" + d1.dersAdi + " " + d1.dersKredi + " Kredi \n"
                        + d2.dersAdi + " " + d2.dersKredi + " Kredi \n"
                        + d3.dersAdi + " " + d3.dersKredi + " Kredi ");


            } else if (Objects.equals(sec, "4")){
                System.out.println("DEVAMSIZLIK DURUMU \n" + y1.dersAdi + " " + y1.adi + " " +y1.soyadi + "\n Devamsızlık == " +y1.devamsizDurum + "\n"
                                                           + y2.dersAdi + " " + y2.adi + " " +y2.soyadi + "\n Devamsızlık == " +y2.devamsizDurum + "\n"
                                                           + y3.dersAdi + " " + y3.adi + " " +y3.soyadi + "\n Devamsızlık == " +y3.devamsizDurum);



            }
        }
    }
}