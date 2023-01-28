package adv;

public class enum0 {
    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }

    public static void main(String[] args) {
        Day mon = Day.Monday;

        System.out.println(mon + "\n");

        for (Day day : Day.values()) {
            System.out.println(day);            
        }
    }
}
