package massive;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ArrayLesson3[] = new int[10];
        System.out.println("Fill Array:");
        for (int i = 0; i < 10; i++) {
            ArrayLesson3[i] = scanner.nextInt();
        }
        int FirstArrayPart[] = new int[5];
        for (int i = 0; i < 5; i++) {
            FirstArrayPart[i] = ArrayLesson3[i];
        }
        Arrays.sort(FirstArrayPart);
        int SecondArrayPart[] = new int[5];
        for (int i = 0; i < 5; i++) {
            SecondArrayPart[i] = ArrayLesson3[i + 5];
        }
        Arrays.sort(SecondArrayPart);
        System.out.println("FirstArrayPart:");
        for (int i = 0; i < 5; i++) {
            System.out.println(FirstArrayPart[i]);
        }
        System.out.println("SecondArrayPart:");
        for (int i = 0; i < 5; i++) {
            System.out.println(SecondArrayPart[i]);
        }

    }
}