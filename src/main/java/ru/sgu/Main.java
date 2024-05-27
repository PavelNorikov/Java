import java.sql.*;

public class Main {
    public static void main(String[] args) {
        t1 t1 = new t1();
        t1.run();

        t2 t2 = new t2();
        t2.run();

        t3 t3 = new t3();
        t3.run();
    }
}

class t1 {
    public void run() {
        String url = "jdbc:postgresql://localhost:5433/t7";
        String user = "postgres";
        String password = "123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT employeeName, age FROM employeesAge WHERE age > 20")) {

            while (rs.next()) {
                String name = rs.getString("employeeName");
                int age = rs.getInt("age");
                System.out.println(name + ", " + age);
            }
            System.out.println();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


class t2 {
    public void run() {
        String url = "jdbc:postgresql://localhost:5433/t7";
        String user = "postgres";
        String password = "123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT departmentName, " +
                     "AVG(salary) AS avgSalary FROM departmentSalary " +
                     "GROUP BY departmentName")) {

            while (rs.next()) {
                String department = rs.getString("departmentName");
                double avgSalary = rs.getDouble("avgSalary");
                System.out.println(department + ", " + avgSalary);
            }
            System.out.println();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}



class t3 {
    public void run() {
        String url = "jdbc:postgresql://localhost:5433/t7";
        String user = "postgres";
        String password = "123";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "SELECT de.employeeName, dl.departmentName, dl.location " +
                             "FROM departmentEmployee de " +
                             "JOIN departmentLocation dl ON de.departmentId = dl.departmentId")) {

            while (rs.next()) {
                String employeeName = rs.getString("employeeName");
                String departmentName = rs.getString("departmentName");
                String location = rs.getString("location");
                System.out.println(employeeName + ", " + departmentName + ", " + location);
            }
            System.out.println();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
