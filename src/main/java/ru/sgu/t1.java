
class t1 {
    int counter = 55;

    public void run() {
        Thread th1 = new Thread(this::increment);
        Thread th2 = new Thread(this::increment);
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(counter);
    }

    public synchronized void increment() {
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }
}
