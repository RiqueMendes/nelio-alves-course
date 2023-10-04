package salaryChallenge;

public class PeopleData {
    public String name;
    public double salary = 6000;
    public double tax;
    

   

    public double salaryAfterTax(double salary){
        return this.salary - 1000;
    } 

     public double salaryIncrease(double salary){
      return   this.salary += this.salary * 0.10 - 1000;
    }

    public String toString(){
        return name +" Gross Salary : " + salary
         +  " Salary After tax : " + salaryAfterTax(salary)
         + " New Salary : " + salaryIncrease(salary);
    }
}
