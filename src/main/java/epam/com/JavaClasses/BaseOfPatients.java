package epam.com.JavaClasses;

import static epam.com.JavaClasses.Diagnosis.*;

    public class BaseOfPatients {
        static Patient patient = new Patient("Ivan I.", "Ivanov", 1, PNEUMONIA);
        static Patient patient2 = new Patient("Petr P.", "Petrov", 2, PNEUMONIA);
        static Patient patient3 = new Patient("Olga S.", "Sidorova", 3, FLU);
        static Patient patient4 = new Patient("Maria D.", "Dmitrieva", 4, HEART_ATTACK);
        static Patient patient5 = new Patient("Fedor F.", "Fedorov", 5, DIABETES);
        static Patient patient6 = new Patient("Anna P.", "Pavlova", 6, DIABETES);
        static Patient patient7 = new Patient("Yulia D.", "Zaiceva", 7, GASTRITIS);

        static Patient [] patients = new Patient[]{patient, patient2, patient3, patient4, patient5, patient6, patient7};

        public static void main(String[] args){

            ResearchPatient.getPatientsDiagnosis(FLU);
            ResearchPatient.getPatientsMedicalCardNumber(1, 1);

        }
}
