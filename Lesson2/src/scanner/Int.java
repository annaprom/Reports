package scanner;

import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input please two integer values: ");
        int FirstInteger = scanner.nextInt(), SecondInteger = scanner.nextInt();
        System.out.println(FirstInteger + SecondInteger);
        System.out.println(FirstInteger - SecondInteger);
        System.out.println(FirstInteger * SecondInteger);
        System.out.println(FirstInteger / SecondInteger);
    }
}


