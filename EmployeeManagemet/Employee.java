package EmployeeManagemet;

class Employee {
    private int employeeNumber;
    private String employeeName;
    private String employeePosition;
    private int attendance; // Number of days present
    private double dailySalary;

    public Employee(int employeeNumber, String employeeName, String employeePosition, int attendance, double dailySalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.attendance = attendance;
        this.dailySalary = dailySalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePosition(){
        return employeePosition;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setEmployeePosition(String employeePosition){
        this.employeePosition = employeePosition;
    }

    public double calculateSalary() {
        return attendance * dailySalary;
    }

    @Override
    public String toString() {
        return "EmployeeNumber: " + employeeNumber + ", Name: " + employeeName + ", EmployeePosition: " + employeePosition + ", Attendance: " + attendance + ", Daily Salary: " + dailySalary;
    }
}
