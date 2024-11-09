import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ders d1 = new Ders("Test", "O","Türkçe","201","101","4");
        Ders d2 = new Ders("Tes", "OO","Matematik","202","101","4");
        Ders d3 = new Ders("Te", "OOO","Fizik","203","101","4");

        System.out.println("Sınıf düzeyinizi giriniz ");

        Scanner scan = new Scanner(System.in);
        int sinif = scan.nextInt();


        if (sinif == 1) {
            String menu1 = """
                    1- Ders Görüntüle\s
                    2- Hoca Görüntüle\s
                    3- Ders Kredisi  \s
                    """;

            System.out.println(menu1);
            String sec = scan.next();

            if (Objects.equals(sec, "1")) {
                System.out.println("Zorunlu Dersleriniz Aşağıdaki Gibidir ");

                Ders d4 = new Ders("Test", "O", "Türkçe", "201", "101", "4");
                System.out.println("\n");
                d4.print();

                Ders d5 = new Ders("Tes", "OO", "Matematik", "202", "101", "4");
                System.out.println("\n");
                d5.print();

                Ders d6 = new Ders("Te", "OOO", "Fizik", "203", "101", "4");
                System.out.println("\n");
                d6.print();


            } else if (Objects.equals(sec, "2")) {


                System.out.println("HOCALARIMIZ \n" + d1.dersAdi + " " + d1.adi + " " + d1.soyadi + "\n" +
                        d2.dersAdi + " " + d2.adi + " " + d2.soyadi + "\n" +
                        d3.dersAdi + " " + d3.adi + " " + d3.soyadi);


            } else {
                System.out.println("Ders KREDİLERİ \n" + d1.dersAdi + " " + d1.dersKredi + " Kredi \n"
                                                       + d2.dersAdi + " " + d2.dersKredi + " Kredi \n"
                                                       + d3.dersAdi + " " + d3.dersKredi + " Kredi ");


            }
        }
    }
}