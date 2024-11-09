public class Main {
    public static void main(String[] args)
    {
        System.out.println(" 1-100 Arasındaki Asal Sayıları Bulan Program ");
        for (int i = 2; i <= 100; i++)
        {
            int adet = 0;

            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                    adet++;
            }
            if (adet <=2)

                System.out.print(i + " ");
        }

    }
}