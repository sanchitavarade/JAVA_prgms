public class Methodoverloading{

    // by chnaging number of parameters
    public void print (int num){
        System.out.println("Integer:"+num);
    }
    public void print (double num){
        System.out.println("Double:"+num);
    }
    // by changing data types
    public void display (String text){
        System.out.println("String"+text);
    }
    public void display(int num){
        System.out.println("Integer:"+num);
    }
    // by changing sequence of parameters
    public void show(String text,int num){
        System.out.println("Integer: " +num+  ", String: " +text);
    }
    public void show(int num,String text){
        System.out.println("String: "+text+ ", Integer: "+num);
    }
    //by different number of arguments
    public void calculate(int a,int b){
        System.out.println("Product :" + (a*b));
    }
     public void calculate(int a,int b,int c){
        System.out.println("Sum :" + (a+b+c));
    }
    public static void main(String[] args) {
        Methodoverloading demo = new Methodoverloading();

        demo.print(5);
        demo.print(5.5);

        demo.display("Hello");
        demo.display(10);

        demo.show(42, "World");
        demo.show("World", 42);

        demo.calculate(2,4);
        demo.calculate(2, 3, 5);
    }

} 

