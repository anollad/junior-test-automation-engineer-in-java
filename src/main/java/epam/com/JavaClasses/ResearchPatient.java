package epam.com.JavaClasses;


public class ResearchPatient extends BaseOfPatients{
    public static void getPatientsDiagnosis(Diagnosis someDiagnosis) {
        System.out.println("Patients with " + someDiagnosis + " are: ");
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnosis().equals(someDiagnosis)){
                System.out.println(patients[i]);
            }
        }
    }

    public static void getPatientsMedicalCardNumber(int fromNumber, int toNumber) {
        System.out.println("Patients with card numbers from " + fromNumber + " to " + toNumber + " are:");
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getMedicalCardNumber() >= fromNumber && patients[i].getMedicalCardNumber() <= toNumber) {
                System.out.println(patients[i]);
            }
        }
    }
}
