import java.util.Random;

public class t3 {
    public void run(){
        String();
        StringBuffer();
        StringBuilder();
    }
    public void String() {
        long start = System.currentTimeMillis();
        String s = new String();

        for (int i = 0; i < 100000; i++) {
            s += genRandString();
        }

        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));
    }

    public void StringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer s = new StringBuffer();

        for (int i = 0; i < 100000; i++) {
            s.append(genRandString());
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start));
    }

    public void StringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            s.append(genRandString());
        }

        long end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start));
    }

    private static String genRandString() {
        char[] str = new char[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            char c = (char) (' ' + rand.nextInt(92));
            str[i] = c;
        }
        return str.toString();
    }
}
