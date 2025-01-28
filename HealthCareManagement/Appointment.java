package HealthCareManagement;

class Appointment {
    private int appoinmentNumber;
    private String patientName;
    private String telephoneNumer;
    private String dateTime;

    public Appointment(int appoinmentNumber, String patientName, String telephoneNumber, String dateTime) {
        this.appoinmentNumber = appoinmentNumber;
        this.patientName = patientName;
        this.telephoneNumer = telephoneNumber;
        this.dateTime = dateTime;
    }

    public int getAppoinmentNumber() {
        return appoinmentNumber;
    }

    public void setAppoinmentNumber(int appoinmentNumber) {
        this.appoinmentNumber = appoinmentNumber;
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
        return "NO : "+ appoinmentNumber +"\n patientName : "+ patientName +"\n telephone Number : "+ telephoneNumer +"\n DateTime : "+  dateTime +"\n ";
    }

}
