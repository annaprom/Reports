package massive5;

import java.util.Scanner;

public class Lesson3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array's length:");
        int ArrayLength = scanner.nextInt();
        int ArrayLesson3_5[] = new int[ArrayLength];
        System.out.println("Fill Array:");
        for (int i = 0; i < ArrayLength; i++) {
            ArrayLesson3_5[i] = scanner.nextInt();
        }
        //int []a = {1,2,3,4};
        for (int i = ArrayLesson3_5.length - 1; i >= 0; i--) {
            System.out.println(ArrayLesson3_5[i]);
        }
    }
}

