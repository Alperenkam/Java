import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dgyili,kalan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz ");
        dgyili = scan.nextInt();

        kalan = dgyili % 12;

        switch (kalan){
            case 0:
                System.out.println("Burcunuz MAYMUN");
                break;


            case 1:
                System.out.println("Burcunuz HOROZ");
                break;


            case 2:
                System.out.println("Burcunuz kÖPEK");
                break;


            case 3:
                System.out.println("Burcunuz DOMUZ");
                break;


            case 4:
                System.out.println("Burcunuz FARE");
                break;


            case 5:
                System.out.println("Burcunuz ÖKÜZ");
                break;


            case 6:
                System.out.println("Burcunuz KAPLAN");
                break;


            case 7:
                System.out.println("Burcunuz TAVŞAN");
                break;


            case 8:
                System.out.println("Burcunuz EJDERHA");
                break;


            case 9:
                System.out.println("Burcunuz YILAN");
                break;


            case 10:
                System.out.println("Burcunuz AT");
                break;


            case 11:
                System.out.println("Burcunuz KOYUN");
                break;
        }
    }
}