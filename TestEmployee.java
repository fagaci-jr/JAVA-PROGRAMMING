class Employee{
    double CalculateSalary(){
        return 0;
    }
}
class fulltimeEmployee extends Employee{
   double monthlysalary;
fulltimeEmployee (double salary){
this.monthlysalary=salary;
}      
double CalculateSalary(){
    return monthlysalary;
}
}    

class partTimeEmployee extends Employee{
    double HoursWorked;
    double RatePerhour;
    partTimeEmployee(double Hours,double rate){
        this.HoursWorked=Hours;
        this.RatePerhour=rate;
    }    
    double CalculateSalary(){
        return HoursWorked*RatePerhour;
    }    
    }
    
public class TestEmployee{
public static void main(String[]args){
    fulltimeEmployee f= new fulltimeEmployee(12.000);
    partTimeEmployee p= new partTimeEmployee(28.000,20);
    System.out.println(f.CalculateSalary());
    System.out.println(p.CalculateSalary());
}    
}