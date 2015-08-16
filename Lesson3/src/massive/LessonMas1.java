package massive;
import java.util.Scanner;
import java.util.*;

public class LessonMas1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int ArrayLesson1[] = new int[10];
        System.out.println("Fill Array:");
        for (int i = 0; i < 10;i++){
            ArrayLesson1[i] = scanner.nextInt();
        }
        Arrays.sort(ArrayLesson1);
        for (int i = 0; i < 10;i++) {
            System.out.println(ArrayLesson1[i]);
        }
    }
}
