import java.util.Scanner;

public class t2 {
    public enum week{
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();
        int num = scanner.nextInt();

        week curDay = week.valueOf(day);
        week res = week.values()[(curDay.ordinal() + num) % 7];

        System.out.println(res);
    }
}
