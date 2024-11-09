import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay, gun;
        System.out.println("Kaçıncı Ayda Doğdunuz: ");
        ay = input.nextInt();

        while (!((ay >= 1) && (ay <= 12))){
            System.out.println("Hatalı Giriş Yaptınız");
            System.out.println("Kacinci Ayda Dogdunuz ?");
            ay = input.nextInt();
        }

        System.out.println("Ayın Kaçında Doğdunuz ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun>=1 && gun<=31) {
                    if (gun <22) {
                        System.out.println("Burcunuz Oğlak");
                    } else {
                        System.out.println("Burcunuz Kova");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 2:
                if (gun>=1 && gun<=28) {
                    if (gun <20) {
                        System.out.println("Burcunuz Kova");
                    } else {
                        System.out.println("Burcunuz Balık");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 3:
                if (gun>=1 && gun<=31) {
                    if (gun <21) {
                        System.out.println("Burcunuz Balık");
                    } else {
                        System.out.println("Burcunuz Koç");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 4:
                if (gun>=1 && gun<=31) {
                    if (gun <21) {
                        System.out.println("Burcunuz Koç");
                    } else {
                        System.out.println("Burcunuz Boğa");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 5:
                if (gun>=1 && gun<=31) {
                    if (gun <22) {
                        System.out.println("Burcunuz Boğa");
                    } else {
                        System.out.println("Burcunuz İkizler");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 6:
                if (gun>=1 && gun<=31) {
                    if (gun <23) {
                        System.out.println("Burcunuz İkizler");
                    } else {
                        System.out.println("Burcunuz Yengec");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 7:
                if (gun>=1 && gun<=31) {
                    if (gun <23) {
                        System.out.println("Burcunuz Yengec");
                    } else {
                        System.out.println("Burcunuz Aslan");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 8:
                if (gun>=1 && gun<=31) {
                    if (gun <23) {
                        System.out.println("Burcunuz Aslan");
                    } else {
                        System.out.println("Burcunuz Başak");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 9:
                if (gun>=1 && gun<=30) {
                    if (gun <23) {
                        System.out.println("Burcunuz Başak");
                    } else {
                        System.out.println("Burcunuz Terazi");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 10:
                if (gun>=1 && gun<=31) {
                    if (gun <23) {
                        System.out.println("Burcunuz Terazi");
                    } else {
                        System.out.println("Burcunuz Akrep");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 11:
                if (gun>=1 && gun<=30) {
                    if (gun <22) {
                        System.out.println("Burcunuz Akrep");
                    } else {
                        System.out.println("Yay Koç");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            case 12:
                if (gun>=1 && gun<=30) {
                    if (gun <22) {
                        System.out.println("Burcunuz Yay");
                    } else {
                        System.out.println("Burcunuz Oğlak");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                } break ;
            default:System.out.println("error");
        }

    }
}