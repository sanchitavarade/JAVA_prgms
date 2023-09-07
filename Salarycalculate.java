public class Salarycalculate {
    public static void main(String[] args) {
        int emp_no = 54;
        String emp_name = "Mahesh";
        int basic = 45000;

        double DA= 0.7*basic;
        double HRA = 0.3*basic;
        double PF= 0.1*basic;
        int CCA = 240;
        int PT = 100;

        // To calculate the gross salary
        double gross_salary = basic + DA + HRA + CCA;

        //To calculate the net salary
        double net_salary = gross_salary - PF - PT;

        // To display the results
        System.out.println("Employee Number: " + emp_no);    
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic salary: " + basic);
        System.out.println("DA :" + DA);
        System.out.println("HRA :" + HRA);
        System.out.println("PF :" + PF);
        System.out.println("CCA :" + CCA);
        System.out.println("PT :" + PT);
        System.out.println("Gross salary :" + gross_salary);
        System.out.println("Net salary :" + net_salary);
    }
}        

 
 