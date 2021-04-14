package epam.com.java_classes;

public class PatientsCards {

    public static void main(String[] args) {

        Patient[] patients = new Patient[]{
                new Patient("Ivan", "I.", "Ivanov", 1, Diagnosis.PNEUMONIA),
                new Patient("Petr", "P.", "Petrov", 2, Diagnosis.PNEUMONIA),
                new Patient("Olga", "S.", "Sidorova", 3, Diagnosis.FLU),
                new Patient("Maria", "D.", "Dmitrieva", 4, Diagnosis.HEART_ATTACK),
                new Patient("Fedor", "F", "Fedorov", 5, Diagnosis.DIABETES),
                new Patient("Anna", "P.", "Pavlova", 6, Diagnosis.DIABETES),
                new Patient("Yulia", "D.", "Zaiceva", 7, Diagnosis.GASTRITIS)};

        PatientsResearch.getPatientsDiagnosis(Diagnosis.FLU, patients);
        PatientsResearch.getPatientsMedicalCardNumber(1, 5, patients);

    }
}
