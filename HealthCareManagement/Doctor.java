package HealthCareManagement;

class Doctor {
    private int doctorNumber;
    private String doctorName;
    private String specialization;
    private String scheduleDate;
    private String scheduleTime;

    public Doctor(int doctorNumber, String doctorName, String specialization, String scheduleDate, String scheduleTime){
        this.doctorNumber = doctorNumber;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = scheduleTime;
    }

    public int getDoctorNumber() {
        return doctorNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorNumber(int doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    // public void setSpecialization(String specialization) {
    //     this.specialization = specialization;
    // }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
    
    @Override
    public String toString(){
        return "DNO : "+ doctorNumber +"\n Doctor Name : "+ doctorName +"\n Specialization : "+ specialization + "\n Channeling Date : "+ scheduleDate +"\n Time : "+ scheduleTime +"\n";
    }
}
