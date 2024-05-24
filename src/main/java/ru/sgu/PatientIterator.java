import java.util.List;
import java.util.NoSuchElementException;

public class PatientIterator implements Iterator<Patient> {
    private List<Patient> patients;
    private int position;

    public PatientIterator(List<Patient> patients) {
        this.patients = patients;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < patients.size();
    }

    @Override
    public Patient next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return patients.get(position++);
    }
}
