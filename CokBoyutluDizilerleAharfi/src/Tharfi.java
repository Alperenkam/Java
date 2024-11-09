public class Tharfi {

        public static void main(String[] args) {
            String [][]dizi = new String[6][5];

            for (int i = 0 ; i < dizi.length ; i++) {
                for (int j= 0 ; j < dizi[i].length ; j++) {
                    if (i == 0){
                        dizi[i][j] = " * ";
                    } else if ( j == 2) {
                        dizi[i][j] = " * ";

                    } else {
                        dizi[i][j] = "   ";
                    }
                }
            }
            for (String[] row : dizi ){
                for (String col : row){
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }


