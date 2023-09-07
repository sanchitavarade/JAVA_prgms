public class StudentInfo {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        // Create 10 student objects and set their information
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            students[i].setInfo("Student " + (i + 1), 20 + i, "Address " + (i + 1));
        }

        // Display the information of all 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " Information:");
            students[i].displayInfo();
            System.out.println();
        }
    }
}
class Student {
    String name;
    int age;
    String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

