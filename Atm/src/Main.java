import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String k_adi= "test" , k_sif = "123" ,adi,sif,ySif,yAdi;

        int deneme= 1,karar;
        int bakiye = 10000 , parayatir , paracek,select;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanici adinizi girin");
        adi = scan.nextLine();

        System.out.println("Şifrenizi girin");
        sif = scan.nextLine();



        while (deneme > 0){
            deneme--;



            if (Objects.equals(adi, k_adi) && Objects.equals(sif, k_sif)){
                System.out.println("Sisteme giriş yaptınız" );


                System.out.println(
                        "1- para yatırma \n" +
                        "2- para çekme \n" +
                        "3- bakiye sorgulama \n" +
                        "4- çıkış \n");

                        select = scan.nextInt();


                         switch (select){
                             case 1:

                                 System.out.println("Yatırmak istediğiniz para miktarını girin");
                                 parayatir = scan.nextInt();

                                 System.out.println("Toplam bakiyeniz "+ (bakiye + parayatir));
                                 break;


                             case 2:

                                System.out.println("Yatırmak istediğiniz para miktarını girin");
                                paracek = scan.nextInt();

                                System.out.println("Toplam bakiyeniz "+ (bakiye - paracek));
                                break;



                             case 3:

                                 System.out.println("Toplam bakiyeniz "+ bakiye);
                                 break;


                             case 4:
                                 System.out.println("ÇIKIŞ YAPILIYOR");
                                 break;
                         }







            }else if (!Objects.equals(adi, k_adi) && Objects.equals(sif, k_sif)){
                System.out.println("Kullanici adi yanlış tekrar deneyiniz");

                System.out.println("Kullanici adini değiştirmek ister misiniz?  e(1) h(2)");
                karar = scan.nextInt();
                scan.nextLine();


                if (karar == 1){
                    System.out.println("Yeni Kullanici adini giriniz");
                    yAdi = scan.nextLine();

                    k_adi = yAdi;
                    System.out.println("KULLANİCİ ADİ DEĞİŞTİRİLMİŞTR " + yAdi);

                }else if(karar == 2){
                    break;
                }

            }else if (Objects.equals(adi, k_adi) && !Objects.equals(sif, k_sif)) {
                System.out.println("Şifre yanlış tekrar deneyiniz");
                System.out.println("Şifre değiştirmek ister misiniz?  e(1) h(2)");
                karar = scan.nextInt();
                scan.nextLine();


                if (karar == 1) {
                    System.out.println("Yeni kullanici adini girin");
                    ySif = scan.nextLine();

                    System.out.println("ŞİFRENİZ DEĞİŞTİRİLMİŞTR " + ySif);
                    sif = ySif;

                }else if(karar == 2){
                    break;
                }
            }
        }
    }
}