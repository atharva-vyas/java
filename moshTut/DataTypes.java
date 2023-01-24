import java.util.Arrays;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        byte myAge = 30;
        
        // we need to add L for long & we need to add F for float
        long viewsCount = 1_234_567_890L;
        float price = 10.99F;

        char letter = 'A';
        boolean isEligible = false;

        String message = "Hello World" + "!!";
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));

        Date now = new Date();
        System.out.println(now);

        int[] numbers = {0, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));

        int[][] TwoNumbers = {{0, 1, 2, 4}, {4, 6, 7}};
        System.out.println(Arrays.deepToString(TwoNumbers));

        // adding final makes it unchangeable
        final float pi = 3.14F;

        float result = 10F / 3F;
        System.out.println(result);
    }
}