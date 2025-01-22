package EmployeeManagemet;

class Employee {
    private int employeeNumber;
    private String employeeName;
    private int attendance; // Number of days present
    private double dailySalary;

    public Employee(int employeeNumber, String employeeName, int attendance, double dailySalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.attendance = attendance;
        this.dailySalary = dailySalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
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

    public double calculateSalary() {
        return attendance * dailySalary;
    }

    @Override
    public String toString() {
        return "EmployeeNumber: " + employeeNumber + ", Name: " + employeeName + ", Attendance: " + attendance + ", Daily Salary: " + dailySalary;
    }
}
