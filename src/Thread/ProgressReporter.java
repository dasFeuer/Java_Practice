package Thread;

class TaskWorker implements Runnable {
    private final String taskName;

    public TaskWorker(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(taskName + ": " + (i * 10) + "% complete");
        }
        System.out.println(taskName + " completed!");
    }
}
public class ProgressReporter {
    public static void main(String[] args) throws InterruptedException {
        Thread dataProcessing = new Thread(new TaskWorker("Data processing"));
        Thread fileBackup = new Thread(new TaskWorker("File backup"));

        System.out.println("Starting tasks.....");

        dataProcessing.start();
        fileBackup.start();

        dataProcessing.join();
        fileBackup.join();

        System.out.println("All tasks completed!");

    }
}
