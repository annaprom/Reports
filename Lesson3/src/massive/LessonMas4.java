package massive;

import java.util.Scanner;

public class LessonMas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Наполните массив:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        double su = 0;
        for (int i : a) {
            su += i;
        }
        double sr = su / n;
        System.out.println("Сумма элементов массива:" + su);
        System.out.println("Средне арифметическое:" + sr);
    }
}
