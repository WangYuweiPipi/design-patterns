import java.util.*;

public class CommandTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.run();
        myRunnable.method();

        Map<String, Object> map = new HashMap<>();

        Map<String, Object> map1 = new Hashtable<>();

        LinkedList<String> linkedList = new LinkedList<>();

        ArrayList<String> list= new ArrayList<>();

    }

    private static class MyRunnable implements Runnable {

        @Override
        public synchronized void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("run start");
            System.out.println("run end");
            notifyAll();
        }

        public synchronized void method() {
            System.out.println("main start");
            try {
//                Thread.sleep(3000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main end");
        }
    }
}
