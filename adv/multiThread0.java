class Thread0 extends Thread {
    public void run() {
        for (char i = 'a'; i < 'k'; i++) {
            System.out.println(i);            
        }
    }
    
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }    
}

// Main Class
public class multiThread0 {
	public static void main(String[] args) {
        Thread0 object0 = new Thread0();
        Thread1 object1 = new Thread1();

        object0.start();
        object1.start();
	}
}
