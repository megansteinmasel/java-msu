
package hashdatabase;

import java.util.HashMap;
import java.util.HashSet;


public class DataBase {
    private HashMap<String, HashSet<Student>> database; //key and value
    
    public DataBase(){
         database = new HashMap<>();
    }
    
    
    public void addStudent(String name, int studentNumber, double gpa){ 
        Student newStudent = new Student(name, studentNumber, gpa);
        if (database.get(name) == null){
            database.put(name, new HashSet<>());
        }
        database.get(name).add(newStudent);
       
    }
    
    public void printDataBase(){
        for(String name : database.keySet()){ // set of all the keys in the hashmap
            HashSet<Student> students = database.get(name);
            for(Student student : students){
                System.out.println(student.getName() + ": (ID=" + student.getidNumber() + "), (gpa " + student.getGPA() + ")"); 
            }
        }
        System.out.println(" ");
    }
    
    public void removeStudent(String name){
        database.remove(name);
        
    }  
    
    public void countStudentsByName(){
        for(String name : database.keySet()){
            System.out.println(name+":");
            int count = 0;
            for(Student student : database.get(name)){
                count = count + 1;
            }
            System.out.println(count);
        } 
        System.out.println(" ");
    }
    
    public void findStudentByID(int id){
        for(String name : database.keySet()){ //loops through hashmap
            HashSet<Student> students = database.get(name);
            for(Student student : students){ //loops through hashset
                if(student.getidNumber() == id){
                    System.out.println(student.getName() + ": (ID=" + student.getidNumber() + "), (gpa " + student.getGPA() + ")");
                }
                
            }
        }System.out.println(" ");
    }
    
    public void printStudentsByGPA(){
        HashMap<Double, HashSet<Student>> map = new HashMap<>(); // creates new hashmap
        
        for(String name : database.keySet()){ //loops through hashmap database
            HashSet<Student> students = database.get(name);
            for(Student student : students){ //loops through it's hashset
                
                if(map.get(student.getGPA())==null){
                    map.put(student.getGPA(), new HashSet<>());
                }
                map.get(student.getGPA()).add(student);
            }
        
        }
        //prints the new hashmap
        for(Double gpa : map.keySet()){ 
            HashSet<Student> gpas = map.get(gpa);
            for(Student student : gpas){
                System.out.println(student.getGPA()+ ":" ); 
                System.out.println(student.getName()+", "+student.getidNumber());
            }
        }
        System.out.println(" ");
     

        
    } 
        
}
