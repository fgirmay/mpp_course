package prob6;

public class MultithreadedQueueTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            multipleQueueCalls();
            multipleQueueThreadSafeCalls();
        }
    }

    public static void multipleQueueCalls() {

        Queue queue = new Queue();

        Runnable r = () -> {
            for (int i = 0; i < 5000; i++) {
                queue.add("Fissehaye");
                String removed = (String) queue.remove();
                if (removed == null) {
                    System.out.println("This is happening because of race condition");
                }
            }
        };

        for (int i = 0; i < 1000; i++) {
            new Thread(r).start();
        }
    }

    public static void multipleQueueThreadSafeCalls() {

        QueueThreadSafe queueThreadSafe = new QueueThreadSafe();

        Runnable r = () -> {
            for (int i = 0; i < 5000; i++) {
                queueThreadSafe.add("Fissehaye");
                String removed = (String) queueThreadSafe.remove();
                if (removed == null) {
                    System.out.println("This will never happen since thread safe");
                }
            }
        };

        for (int i = 0; i < 1000; i++) {
            new Thread(r).start();
        }
    }
}
