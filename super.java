class Employee{
    private double salary;
    public double calculateSalary(){
        return salary;
    }
    

    public Employee(double salary){
        this.salary=salary;
        }
        }
        class Manager extends Employee{
            private double salary;
            private double percent;
            
    public double calculateSalary(){
        return salary=salary+percent/100;
    }
}
 class Programer extends Employee{
    public double calculateSalary(){
        super.calculateSalary();
    }
}
public class Main{
    public static void main(String[]args){
        Manager m=new Manager();
        System.out.println(m.calculateSalary());
    }
}

  
