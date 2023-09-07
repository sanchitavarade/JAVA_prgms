

class Area {
     double length;
     double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {

        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        double length= 12;
        double breadth=10;
        
        // Set the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        
    }
}
