
package hashdatabase;


public class Student {
    private String name;
    private double gpa;
    private int idNumber;
   
    
    public Student(String name, int idNumber, double gpa){ 
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }
    
    
    public String getName(){ 
        return name;
    }
    
    public int getidNumber(){
        return idNumber;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public void changeGPA(double gpa){ 
        this.gpa = gpa;
    } 
    
    @Override
    public String toString(){
        return name;
    }
}
