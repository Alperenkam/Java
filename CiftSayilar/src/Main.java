import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        System.out.print("Cift bir sayi giriniz: ");
        Scanner yenu = new Scanner(System.in);

        sayi = yenu.nextInt();

        for(int i = 0 ; i < sayi ; i++){

            if ( i % 2 == 0){

                System.out.println(i);
            }else{
                continue;
            }
        }




    }
}