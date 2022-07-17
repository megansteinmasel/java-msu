
package hashdatabase;


public class HashDatabase {

    public static void main(String[] args) {
        DataBase database = new DataBase();
        database.addStudent("Joe Schmo", 1101, 3.2);
        database.addStudent("Joe Schmo", 99999, 4.0);
        database.addStudent("Katie Katerson", 1415926, 3.9);
        database.addStudent("Lizzie", 8888, 3.7);
        database.addStudent("Watson TheBassetHound", 12345, 2.4);
        
        //Method one
        System.out.println("#1 Counts students by name:");
        System.out.println("-----------------------------");
        System.out.println(" ");
        database.countStudentsByName();
        
        
        //Method two
        System.out.println("#2 Finds students by ID:");
        System.out.println("-----------------------------");
        System.out.println(" ");
        database.findStudentByID(1101);
        
        //Method three
        System.out.println("#3 Prints students by GPA:");
        System.out.println("-----------------------------");
        System.out.println(" ");
        database.printStudentsByGPA();
        
        
        
        
    }
    
}
