public class Eleman {
    String ad;
    String soyad;
    int girisyili;
    int maas;




    Eleman(String ad ,String soyad ,int girisyili,int maas){
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.girisyili = girisyili;
    }


    void print(){
        System.out.println("Adı               : "+ad);
        System.out.println("Soyadı            : "+soyad);
        System.out.println("Maaşı             : "+maas);
        System.out.println("Giris Yılı        : "+girisyili);


    }
}
