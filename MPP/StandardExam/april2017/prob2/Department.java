package april2017.prob2;

public abstract class Department {
    private StringQueue queue = new StringQueue();

    public StringQueue getQueue() {
        return queue;
    }

    //implement
    public abstract String getName();


    public String nextMessage() {

        String result = "";
        try {
            result = queue.dequeue();

        } catch (EmptyQueueException e) {

            e.printStackTrace();
        }

        return result;
    }

    public void addMessage(String msg) {
        queue.enqueue(msg);
    }
}
