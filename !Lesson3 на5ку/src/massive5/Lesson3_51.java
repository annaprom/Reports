package massive5;

import java.util.Scanner;

public class Lesson3_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array's length:");
        int ArrayLength = scanner.nextInt();
        int ArrayLesson3_5[] = new int[ArrayLength];
        System.out.println("Fill Array:");
        for (int i = 0; i < ArrayLength; i++) {
            ArrayLesson3_5[i] = scanner.nextInt();
        }
        System.out.println("Input element's index:");
        int ElementIndex = scanner.nextInt();
        System.out.println(ArrayLesson3_5[ElementIndex]);
    }
}