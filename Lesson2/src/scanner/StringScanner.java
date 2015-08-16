package scanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input please three strings:");
        String FirstString = scanner.nextLine();
        System.out.println("You have entered: " + FirstString);
        String SecondString = scanner.nextLine();
        System.out.println("You have entered: " + SecondString);
        String ThirdString = scanner.nextLine();
        System.out.println("You have entered: " + ThirdString);
        System.out.println("FirstString + ThirdString: " + FirstString + ThirdString);
        System.out.println("ThirdString + SecondString + FirstString: " + ThirdString + SecondString + FirstString);
        System.out.println("FirstString + SecondString + ThirdString: " + FirstString + SecondString + ThirdString);
    }
}
