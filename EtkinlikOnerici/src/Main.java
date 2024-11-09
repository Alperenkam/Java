import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int derece;


        System.out.println("Hava Sıcaklığını DERECE olarak Giriniz");

        Scanner yenu = new Scanner(System.in);
        derece = yenu.nextInt();


        if (derece >= 50) {
            System.out.println("Evde klima açarak bir film veya bir kutu oyunu oynanabilir: ");

        } else if (derece > 25 && derece < 50) {
            System.out.println("Havuza Girebilirsiniz: ");


        } else if (derece > 15 && derece < 25) {
            System.out.println("Pikniğe gidebilirsiniz: ");

        } else if (derece > 5 && derece < 16) {
            System.out.println("Sinemaya gidebilirsiniz: ");

        } else if (derece >= -10 && derece < 6) {
            System.out.println("Kayağa gidebilirsiniz: ");
        } else {
            System.out.println("evde sıcak bir yerde durunuz ve dizi izleyebilir ya da dışarıda karı izleyebilirsiniz");
        }

    }
}