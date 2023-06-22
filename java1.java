package home_java2;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, summ=0;
        int count = 0;
        int counter = 0;
        System.out.println("Введите длину простых чисел, подлежащих сложению");
        a = scanner.nextInt();

        for(int i = 2; counter < a; i++)
        {
            count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count== 2 )
            {
                summ= summ + i;
                counter++;
            } 
        }
        System.out.print(summ + " ");
    }
}
