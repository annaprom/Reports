package scanner;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пожалуйста два целых числа: ");
        int x = scanner.nextInt(), y = scanner.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }
}


