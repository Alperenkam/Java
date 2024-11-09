public class Main {
    public static void main(String[] args) {
        String[] Dizi = {"1","2","3","4","5","5","6","5","4","3"};
        String istek = "5";
        int adet = 0;

        for (String element : Dizi) {
            if (element.equals(istek)) {
                adet++;
            }
        }
        System.out.println(istek+ " den Adet: " + adet);
    }
}