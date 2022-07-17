
package hashdatabase;


public class Node {
    private Node next;
    
    private Student student;
    
    public Node(Student student){
        this.student = student;
    }
    
    public void setNext(Node next){
         this.next = next;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Student getStudent(){
        return student;
    }
    
}
