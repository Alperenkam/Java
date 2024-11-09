public class Main {


    static boolean palindromMu(String str){
        int j = str.length()-1;
        for (int i= 0 ; i < j; i++){
            if (str.charAt(i) == str.charAt(j)){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        System.out.println(palindromMu("ala"));


    }
}