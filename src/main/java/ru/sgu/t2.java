import java.util.concurrent.*;

class t2 extends RecursiveTask<Long> {
    long n;

    public t2(long n) {
        this.n = n;
    }

    public  void run() {
        int n = 10;

        ForkJoinPool pool = new ForkJoinPool();
        t2 t = new t2(n);

        long res = pool.invoke(t);
        System.out.println(res);
    }

    @Override
    protected Long compute() {
        if (n < 2) {
            return n;
        }
        else {
            t2 f1 = new t2(n - 1);
            t2 f2 = new t2(n - 2);

            f1.fork();
            Long result2 = f2.compute();
            Long result1 = f1.join();

            return result1 + result2;
        }
    }
}
