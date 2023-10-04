package student;

public class Student {
    
    public String name;
    public int nota1; 
    public int nota2;
    public int nota3;

    public Boolean pass(){
        if( (nota1 + nota2 + nota3 / 3 ) >= 60){
            System.out.println("Pass - Student Approved");
            return true;
            
        }
        System.out.println("Fail - Student Not Approved");
        return false;


    }

    public double required(){
       double required = (nota1 + nota2 + nota3 / 3)  - 60;

        return required;
    }
}
