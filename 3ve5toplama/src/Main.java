public class Main {
    public static void main(String[] args) {

        int topla = 0;
        for (int i = 0 ; i  < 10 ; i++){
            if (i % 3 == 0 || i % 5 == 0){
                topla +=i;
            }
            else{
                continue;
            }

        }

        System.out.println(("3 or 5  and 3 and 5 sum is "+topla));




    }
}