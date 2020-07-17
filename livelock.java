public class livelock {
    public static void main (String[] args) {
        final worker worker1 = new worker("Worker 1 ", true);
        final worker worker2 = new worker("Worker 2", true);

        final commonresource s = new commonresource(worker1);

        new Thread(() -> {
            worker1.work(s, worker2);
        }).start();

        new Thread(() -> {
            worker2.work(s, worker1);
        }).start();
    }
}
