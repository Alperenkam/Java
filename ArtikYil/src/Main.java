import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dyil;

        System.out.print("Yıl giriniz: ");
        Scanner yenu = new Scanner(System.in);
        dyil= yenu.nextInt();


        if(dyil % 4 == 0){
            System.out.println(dyil + " Artık yıldır");
        }else{
            System.out.println(dyil + " Artık yıl değildir");

        }
    }
}