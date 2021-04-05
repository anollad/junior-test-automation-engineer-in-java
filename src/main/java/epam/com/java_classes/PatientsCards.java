package epam.com.java_classes;

import static epam.com.java_classes.Diagnosis.*;

    public class PatientsCards {

        public static void main(String[] args){

            Patient patient = new Patient("Ivan","I.", "Ivanov", 1, PNEUMONIA);
            Patient patient2 = new Patient("Petr", "P.","Petrov", 2, PNEUMONIA);
            Patient patient3 = new Patient("Olga", "S.","Sidorova", 3, FLU);
            Patient patient4 = new Patient("Maria", "D.","Dmitrieva", 4, HEART_ATTACK);
            Patient patient5 = new Patient("Fedor", "F","Fedorov", 5, DIABETES);
            Patient patient6 = new Patient("Anna", "P.","Pavlova", 6, DIABETES);
            Patient patient7 = new Patient("Yulia","D.", "Zaiceva", 7, GASTRITIS);

            Patient [] patients = new Patient[]{patient, patient2, patient3, patient4, patient5, patient6, patient7};

            PatientsResearch.getPatientsDiagnosis(FLU, patients);
            PatientsResearch.getPatientsMedicalCardNumber(1, 5, patients);

        }
}
