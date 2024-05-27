
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            t1 t1 = new t1();
            t1.run();
        }

        t2 t2 = new t2(0);
        t2.run();

        t3 t3 = new t3();
        //t3.run();
    }
}