import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CrptApi {
    private final Lock lock = new ReentrantLock();
    private final long requestLimit;
    private long lastRequestTime = System.currentTimeMillis();

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.requestLimit = timeUnit.toMillis(1) * requestLimit;
    }
    public void createDocument(String document, String signature) {
        lock.lock();
        try {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - lastRequestTime;
            if (elapsedTime < requestLimit) {
                try {
                    Thread.sleep(requestLimit - elapsedTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            //  POST request
            System.out.println("Document created: " + document);
            lastRequestTime = System.currentTimeMillis();
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 1);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> crptApi.createDocument("Document " + Thread.currentThread().getId(),
                    "Signature")).start();
        }
    }
}
