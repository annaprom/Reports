package massive;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array's length:");
        int ArraySize = scanner.nextInt();
        int ArrayLesson2[] = new int[ArraySize];
        System.out.println("Fill Array:");
        for (int i = 0; i < ArraySize; i++) {
            ArrayLesson2[i] = scanner.nextInt();
        }
        int AdditionalVariable = ArrayLesson2[0];
        ArrayLesson2[0] = ArrayLesson2[ArraySize - 1];
        ArrayLesson2[ArraySize - 1] = AdditionalVariable;
        //for (int i = 0; i < ArraySize;i++) {
        //    System.out.println(a[i]);
        //}
        String OutputString = Arrays.toString(ArrayLesson2);
        System.out.println(OutputString);
    }
}