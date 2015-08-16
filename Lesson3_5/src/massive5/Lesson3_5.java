package massive5;

import java.util.Scanner;

public class Lesson3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Наполните массив:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //int []a = {1,2,3,4};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

