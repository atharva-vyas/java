// package adv;

class Thread0 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);            
        }
    }
    
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println(i);
        }
    }    
}

// Main Class
public class multiThread0 {
	public static void main(String[] args) {
        Thread0 object0 = new Thread0();
        object0.start();

        Thread1 object1 = new Thread1();
        object1.start();
	}
}
