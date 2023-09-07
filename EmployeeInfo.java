class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // Parameterized constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println(); 
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee e1 = new Employee("Robert", 1994, 20000.0, "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, 50000.0, "68D-WallsStreet");
        Employee e3 = new Employee("John", 1999, 65000.0, "26B-WallsStreet");

        // Display information for each employee
        System.out.println("Employee Information:");
        e1.display();
        e2.display();
        e3.display();
    }
}
