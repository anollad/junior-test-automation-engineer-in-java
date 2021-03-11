package epam.com.JavaClasses;

public class Patient {
    private int id;
    String nameAndPatronymic;
    String surname;
    private String address;
    private int telephone;
    int medicalCardNumber;
    Diagnosis diagnosis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAndPatronymic() {
        return nameAndPatronymic;
    }

    public void setNameAndPatronymic(String nameAndPatronymic) {
        this.nameAndPatronymic = nameAndPatronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String nameAndPatronymic, String surname) {
        this.id = id;
        this.nameAndPatronymic = nameAndPatronymic;
        this.surname = surname;
    }

    public Patient(String nameAndPatronymic, String surname, int medicalCardNumber, Diagnosis diagnosis) {
        this.nameAndPatronymic = nameAndPatronymic;
        this.surname = surname;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nameAndPatronymic='" + nameAndPatronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis=" + diagnosis +
                '}';
    }
}
