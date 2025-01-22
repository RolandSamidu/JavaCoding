import java.util.ArrayList;
import java.util.Scanner;

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

public class EmployeeManagement {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Calculate Salary");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    calculateSalary();
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter Employee Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Attendance: ");
        int attendance = scanner.nextInt();
        System.out.print("Enter Daily Salary: ");
        double dailySalary = scanner.nextDouble();

        employeeList.add(new Employee(number, name, attendance, dailySalary));
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee() {
        System.out.print("Enter Employee Number to remove: ");
        int number = scanner.nextInt();

        Employee toRemove = null;
        for (Employee emp : employeeList) {
            if (emp.getEmployeeNumber() == number) {
                toRemove = emp;
                break;
            }
        }

        if (toRemove != null) {
            employeeList.remove(toRemove);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter Employee Number to update: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employeeList) {
            if (emp.getEmployeeNumber() == number) {
                System.out.print("Enter new name (current: " + emp.getEmployeeName() + "): ");
                String newName = scanner.nextLine();
                emp.setEmployeeName(newName);

                System.out.print("Enter new attendance (current: " + emp.getAttendance() + "): ");
                int newAttendance = scanner.nextInt();
                emp.setAttendance(newAttendance);

                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void calculateSalary() {
        System.out.print("Enter Employee Number to calculate salary: ");
        int number = scanner.nextInt();

        for (Employee emp : employeeList) {
            if (emp.getEmployeeNumber() == number) {
                System.out.println("Salary of " + emp.getEmployeeName() + ": " + emp.calculateSalary());
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }
}

