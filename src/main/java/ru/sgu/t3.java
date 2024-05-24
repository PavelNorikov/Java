import java.util.ArrayList;
import java.util.List;

public class t3 {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Иванов Иван Иванович", "м", 45, List.of("Головная боль", "Повышенное давление")));
        patients.add(new Patient("Петрова Мария Сергеевна", "ж", 30, List.of("Кашель")));
        patients.add(new Patient("Сидоров Алексей Николаевич", "м", 50, List.of("Одышка", "Боль в груди")));

        Iterator<Patient> patientIterator = new PatientIterator(patients);

        while (patientIterator.hasNext()) {
            Patient patient = patientIterator.next();
            System.out.println(patient);
        }
    }
}
