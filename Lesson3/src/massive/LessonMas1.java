package massive;
import java.util.Scanner;
import java.util.*;

public class LessonMas1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[10];
        System.out.println("Наполните массив:");
        for (int i = 0; i < 10;i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < 10;i++) {
            System.out.println(a[i]);
        }
    }
}
