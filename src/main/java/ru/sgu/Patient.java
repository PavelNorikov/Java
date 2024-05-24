import java.util.List;

public class Patient {
    private String fullName;
    private String gender;
    private int age;
    private List<String> complaints;

    public Patient(String fullName, String gender, int age, List<String> complaints) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.complaints = complaints;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<String> getComplaints() {
        return complaints;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", complaints=" + complaints +
                '}';
    }
}