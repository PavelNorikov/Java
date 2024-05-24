import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class t1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();

        LocalDate d1 = strToDate(date1);
        LocalDate d2 = strToDate(date2);

        long res = ChronoUnit.DAYS.between(d1, d2);

        System.out.println(Math.abs(res));
    }

    private LocalDate strToDate(String date) {
        String[] parts = date.split(" ");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return LocalDate.of(year, month, day);
    }
}
