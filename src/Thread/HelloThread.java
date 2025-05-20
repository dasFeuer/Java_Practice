package Thread;

public class HelloThread extends Thread{
    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
    }


    public static void main(String[] args) throws InterruptedException {
        HelloThread thread1 = new HelloThread();
        HelloThread thread2 = new HelloThread();
        thread1.start();
        thread2.start();


        String[] importantMessage = {
            "Important message 1",
            "Important message 2",
            "Important message 3"
        };

        for (String s : importantMessage) {
            Thread.sleep(5000);
            System.out.println(s);

        }
    }
}

