
public class ThreadExample implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread("One");
        Thread thread2 = new Thread("Two");
        thread1.start();
        thread2.start();

        System.out.println("Thread names are following:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

        try{
            thread1.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        thread1.setPriority(1);
        int firstThreadPriority = thread1.getPriority();
        System.out.println(firstThreadPriority);
        System.out.println("Thread Running");

    }

    @Override
    public void run() {

    }
}