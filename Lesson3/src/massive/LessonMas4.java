package massive;

import java.util.Scanner;

public class LessonMas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array's length:");
        int ArrayLength = scanner.nextInt();
        int ArrayLesson4[] = new int[ArrayLength];
        System.out.println("Fill Array:");
        for (int i = 0; i < ArrayLength; i++) {
            ArrayLesson4[i] = scanner.nextInt();
        }
        double SummOfArrayElements = 0;
        for (int i : ArrayLesson4) {
            SummOfArrayElements += i;
        }
        double ArithmeticAverage = SummOfArrayElements / ArrayLength;
        System.out.println("Summ Of Array's Elements:" + SummOfArrayElements);
        System.out.println("Arithmetic Average:" + ArithmeticAverage);
    }
}
