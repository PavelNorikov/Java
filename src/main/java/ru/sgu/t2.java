import java.util.*;
import java.util.stream.*;

public class t2 {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stream<Integer> intStream = Stream.of(input.split("\\s+")).map(Integer::parseInt);

        sort(intStream);
    }

    public void sort(Stream<Integer> stream) {
        List<Integer> resAr = stream.sorted().distinct().toList();
        System.out.println("2 наибольший: " + resAr.get(resAr.size() - 2));
        System.out.println("3 наименьший: " + resAr.get(2));
    }
}
