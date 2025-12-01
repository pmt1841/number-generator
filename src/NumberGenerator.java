public class NumberGenerator implements Runnable {
    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(getThreadName() + ": Printing " + i + ". HashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getThreadName() + " Interrupted");
        }

        System.out.println(getThreadName() + ": Finished");
    }
}
