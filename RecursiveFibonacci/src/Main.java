public class Main {

        static int Fibo(int n) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return (Fibo(n - 1) + Fibo(n - 2));
            }
        }

        public static void main(String[]args){
            System.out.println("Girdiğiniz adımda ona eşit sayı  = "+Fibo(10));

        }
    }
