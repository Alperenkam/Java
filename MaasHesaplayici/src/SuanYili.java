/*
public class SuanYili {

    int saniye;
    int dakika;
    int saat;
    int gun;
    int ay;
    int yil;


    SuanYili(int saniye, int dakika, int saat, int gun, int ay, int yil) {
        this.saniye = saniye;
        this.dakika = dakika;
        this.saat = saat;
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
    }


    void print() throws InterruptedException {
        System.out.println("Saniye " + saniye);
        System.out.println("Dakika " + dakika);
        System.out.println("Saat " + saat);
        System.out.println("Gun " + gun);
        System.out.println("Ay " + ay);
        System.out.println("Yil " + yil);


        while (saniye < 61) {
                saniye++;

                Thread.sleep(1000);
                if (saniye == 60){
                    saniye = 0;
                    dakika +=1;

                }if (dakika == 60){
                    dakika = 0;
                    saat +=1;

                }if (saat == 24) {
                    saat = 0;
                    gun += 1;

                }if (gun == 30) {
                    gun = 0;
                    ay += 1;

                }if (ay == 13){
                    ay = 1;
                    yil +=1;

                }
            }
        }
    }



 */