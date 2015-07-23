package massive;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Наполните массив:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int t = a[0];
        a[0] = a[n - 1];
        a[n - 1] = t;
        //for (int i = 0; i < n;i++) {
        //    System.out.println(a[i]);
        //}
        String s = Arrays.toString(a);
        System.out.println(s);
    }
}