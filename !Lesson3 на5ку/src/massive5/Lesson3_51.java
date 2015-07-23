package massive5;

import java.util.Scanner;

public class Lesson3_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Наполните массив:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Введите индекс элемента:");
        int ind = scanner.nextInt();
        System.out.println(a[ind]);
    }
}