package HealthCareManagement;

class Appointment {
    private int appoinmeentNumber;
    private String patientName;
    private String telephoneNumer;
    private String dateTime;

    public Appointment(int appoinmeentNumber, String patientName, String telephoneNumber, String dateTime) {
        this.appoinmeentNumber = appoinmeentNumber;
        this.patientName = patientName;
        this.telephoneNumer = telephoneNumber;
        this.dateTime = dateTime;
    }

    public int getAppoinmeentNumber() {
        return appoinmeentNumber;
    }

    public void setAppoinmeentNumber(int appoinmeentNumber) {
        this.appoinmeentNumber = appoinmeentNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getTelephoneNumer() {
        return telephoneNumer;
    }

    public void setTelephoneNumer(String telephoneNumer) {
        this.telephoneNumer = telephoneNumer;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String toString(){
        return "NO : "+ appoinmeentNumber +"\n patientName : "+ patientName +"\n telephone Number : "+ telephoneNumer +"\n DateTime : "+  dateTime +"\n ";
    }

}
