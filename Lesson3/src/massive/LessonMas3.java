package massive;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Наполните массив:");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        int b[] = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
        int c[] = new int[5];
        for (int i = 0; i < 5; i++) {
            c[i] = a[i + 5];
        }
        Arrays.sort(c);
        System.out.println("Массив В:");
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Массив С:");
        for (int i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }

    }
}