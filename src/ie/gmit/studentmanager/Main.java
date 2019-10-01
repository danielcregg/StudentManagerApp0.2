package ie.gmit.studentmanager;

public class Main {
    
    public static void main(String[] args){
        Menu m = new Menu();
        m.start();
        
        StudentManager sm1 = new StudentManager();
        
        Student student1 = new Student("G00123459");
        Student student2 = new Student("G00123457");
        
        boolean status;
        int numOfStudents;
        
        status = sm1.add(student1);
        System.out.println(status);
        status = sm1.add(student2);
        System.out.println(status);
        
        //status = sm1.delete("G00123459");
        //System.out.println(status);
        
        numOfStudents = sm1.findTotalStudents();
        System.out.println(numOfStudents);
         
    }
}
