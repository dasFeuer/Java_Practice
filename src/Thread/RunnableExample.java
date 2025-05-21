package Thread;

class DownloaderThread implements Runnable {
    private final String fileName;

    public DownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Downloading started: " + fileName);
            try{
                int downloadTime = (int) (Math.random() * 4000);
                Thread.sleep(downloadTime);

            } catch (InterruptedException e) {
                System.out.println("Download Thread interrupted: " + e.getMessage());
                return;
            }
            System.out.println("Downloading finished: " + fileName);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        String[] files = {"file.pdf", "video.mp4", "image.jpg", "document.docx", "presentation.pptx"};

        for (String file : files) {
            Thread downloaderThread = new Thread(new DownloaderThread(file));
            downloaderThread.start();
        }

        System.out.println("All downloads are started.");
    }
}
