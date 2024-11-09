import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Sayi girin 2 tane");

        int say1 = scan.nextInt();
        int say2 = scan.nextInt();
        int enbyk;


        enbyk = Math.max(say1, say2);


        for (int i = 1 ; i <= enbyk  ; i++){
            if (say1 % i == 0 && say2 % i == 0){
                System.out.println("eboblar " +i);

                if ( say1 % say2 == 0){
                    System.out.println("ekok "+say1);

                }else if ( say2 % say1 == 0){
                    System.out.println("ekok "+say1);

                }else if (say1 % say2 >= 0 ){
                    System.out.println("ekok "+say1 * say2);

                }
            }
        }
    }
}