import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class t1 {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stream<Integer> intStream = Stream.of(input.split("\\s+")).map(Integer::parseInt);

        Predicate<Integer> cond = num -> num > 0;
        List<Integer> res = filter(intStream, cond);
        System.out.println("res: " + res);
    }

    public static List<Integer> filter(Stream<Integer> stream, Predicate<Integer> cond) {
        return stream.filter(cond).collect(Collectors.toList());
    }
}
