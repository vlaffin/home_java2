package home_java2;

import java.util.Scanner;

public class java3 {
     public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;
            for (int i = 0; i < n; i++)
                {
                    System.out.println("Введите число: ");
                    array[i] = scanner.nextInt(); 
                    
                }
        
            for (int i = 0; i < n; i++) {
                if(array[i] / 100 == 0 ) {
                    count = count + i;
                }
            }
            System.out.println("Сумма индексов двузначных элементов = " + count);

            System.out.println("Массив до преобразования: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            } 
            System.out.println();
            System.out.println("Массив после преобразования: ");
            for (int i = 0; i < n; i++) {
                if (array[i] < 0) {
                    array[i] = count;
                }
            System.out.print(array[i] + " ");
            } 
    }
}
