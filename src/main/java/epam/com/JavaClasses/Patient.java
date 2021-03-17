package epam.com.JavaClasses;

public class Patient {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String address;
    private int telephone;
    private int medicalCardNumber;
    Diagnosis diagnosis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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

    public Patient(String name, String patronymic, String surname, int medicalCardNumber, Diagnosis diagnosis) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }
    public Patient(int id, String name, String patronymic, String surname) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis=" + diagnosis +
                '}';
    }
}
