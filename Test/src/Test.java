import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Student> someStudent = new ArrayList<Student>();
	    char quit = 'Y';
	     int id;
	     String name;
	     float cgpa;

	     while(quit == 'Y'){
	         System.out.print("\n ID: ");
	         id=scan.nextInt();

	         System.out.print("\n Name: ");
	         name=scan.next();

	         System.out.print("\n CGPA: ");
	         cgpa=scan.nextFloat();

	         someStudent.add (new Student(id, name, cgpa));
	         System.out.print(" Enter Another Record? (Y/N)");
	         String word = scan.next();
	         word = word.toUpperCase();
	         quit= word.charAt(0);
	         //scan.close();
	     }
	     
	     System.out.print(" Enter input to delete");
         String delete = scan.next();
         
         
         if(delete.equalsIgnoreCase("Yes")) {
        	 for(Student student:someStudent){
    	         
    	         if(student.getId() == 1) {
    	        	 someStudent.remove(someStudent);
    	        	 continue;
    	         }
    	         System.out.println(student.getId());
    	         System.out.println(student.getName());
    	         System.out.println(student.getCgpa());
    	     }
        	 
         }
        	 

	     
	     }
}
