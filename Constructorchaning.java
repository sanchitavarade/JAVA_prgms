public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        // Call the parameterized constructor with default values
        this("Unknown", 0);
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();          // Calls default constructor
        Student s2 = new Student("John", 20); // Calls parameterized constructor
        s1.display();
        s2.display();
    }
}
