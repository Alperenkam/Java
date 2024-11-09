import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int yillikbonus = 200 ,yil = 2024;

        Eleman e1 = new Eleman("test","123",2000,50000);
        System.out.println("\n");
        e1.print();


        Eleman e2 = new Eleman("test2", "12", 2000 , 70000);
        System.out.println("\n");
        e2.print();


        Scanner scan = new Scanner(System.in);



        System.out.println();
        System.out.println("1-) Aynı oranda zam yoksa  2-) tekil zam   (1)aynı  (2)tekil");
        int karar = scan.nextInt();


        switch (karar){
            case 1:
                System.out.println("Aynı zam oranını giriniz ");
                int zam = scan.nextInt();

                e1.maas =e1.maas + (e1.maas * zam / 100) + (yil- e1.girisyili) * yillikbonus ;
                System.out.println();
                e1.print();

                e2.maas =e2.maas + (e2.maas * zam / 100) + (yil- e2.girisyili) * yillikbonus ;
                System.out.println();
                e2.print();

                break;

            case 2:
                System.out.println(e1 +" Çalışanı için Tekil zam oranını giriniz ");
                int tekilzam = scan.nextInt();

                System.out.println(e2 +" Çalışanı için Tekil zam oranını giriniz ");
                int tekilzam2 = scan.nextInt();


                e1.maas =e1.maas + (e1.maas * tekilzam / 100) + (yil- e1.girisyili) * yillikbonus ;
                e1.print();

                e2.maas =e2.maas + (e2.maas * tekilzam2 / 100) + (yil- e2.girisyili) * yillikbonus ;
                e2.print();


                break;
        }
    }
}