import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


class t3 {
    private Random r = new Random();

    private Supplier<String> producer = () ->
            String.valueOf(r.nextInt()) + " " + String.valueOf(r.nextInt());

    private Consumer<String> consumer = s -> {
        System.out.println("Потребитель " + Thread.currentThread().getName() +
                " съел " + s.split(" ")[0] + ". ккал = " + s.split(" ")[1]);
    };

    public void run() {
        while (true) {
            CompletableFuture.supplyAsync(producer).thenAcceptAsync(consumer);
        }
    }
}