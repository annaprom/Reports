package scanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пожалуйста три строки:");
        String s1 = scanner.nextLine();
        System.out.println("Вы ввели: " + s1);
        String s2 = scanner.nextLine();
        System.out.println("Вы ввели: " + s2);
        String s3 = scanner.nextLine();
        System.out.println("Вы ввели: " + s3);
        System.out.println("S1+S3: " + s1 + s3);
        System.out.println("S3+S2+S1: " + s3 + s2 + s1);
        System.out.println("S1+S2+S3: " + s1 + s2 + s3);
    }
}
