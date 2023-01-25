import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input number: ");
        int ipNUmber = scanner.nextInt();

        if (ipNUmber % 5 == 0 && ipNUmber % 3 == 0) {
            System.out.println("fizzBuzz");
        } else {
            if (ipNUmber % 5 == 0) {
                System.out.println("fizz");
            } else if (ipNUmber%3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(ipNUmber);
            }
        }
    }
}
