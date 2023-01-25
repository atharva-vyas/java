import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("type exit to quit: ");
            String ip = scanner.nextLine();

            if (ip.equals("exit")) {
                break;
            } else {
                System.out.println(ip);
            }
        }

        for(int o = 10; o<15; o++) {
            System.out.println(o);
        }

        String[] cars = {"merc", "bmw", "carn", "car"};

        for (String carName : cars) {
            System.out.println(carName);
        }
    }
}
