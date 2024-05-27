import java.util.*;
import java.lang.Object;
import java.util.stream.*;

class C implements Comparable<C>{
    String lastName;
    String firstName;
    String middleName;
    String company;
    Integer rating;

    public C(String lastName, String firstName, String middleName, String company, int rating) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.company = company;
        this.rating = rating;
    }

    public void printStr() {
        System.out.println(lastName + " " + firstName + " " + middleName + " " + company + " " + rating);
    }


    @Override
    public int compareTo(C x) {
        int res = x.rating.compareTo(this.rating);
        if (res == 0){
            res = this.lastName.compareTo(x.lastName);
        }
        if (res == 0){
            res = x.firstName.compareTo(this.firstName);
        }
        if (res == 0){
            res = this.middleName.compareTo(x.middleName);
        }
        return res;
    }

}

public class t1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Set<C> s = new HashSet<>();
        List<C> arr = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split(" ");
            String lastName = parts[0];
            String firstName = parts[1];
            String company = parts[parts.length - 2];
            String middleName;
            int rating = Integer.parseInt(parts[parts.length - 1]);
            if (parts.length == 5) {
                middleName = parts[2];
            } else {
                middleName = "";
            }
            arr.add(new C(lastName, firstName, middleName, company, rating));
        }

        Collections.sort(arr);
        arr = arr.stream().distinct().toList();
        for (C c : arr) {
            c.printStr();
        }
    }
}
