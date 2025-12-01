public class Main {
    public static void main(String[] args) {
        try {
            NumberGenerator numberGenerator_1 = new NumberGenerator();
            NumberGenerator numberGenerator_2 = new NumberGenerator();

            Thread thread_1 = new Thread(numberGenerator_1, "Thread 1");
            Thread thread_2 = new Thread(numberGenerator_2, "Thread 2");

            thread_1.setPriority(Thread.MIN_PRIORITY);
            thread_2.setPriority(Thread.MAX_PRIORITY);

            thread_1.start();
            thread_2.start();
        } catch (Exception e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
