import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	
	//static ArrayList arraylist;
	
	public static void main(String[] args) {
	
	  ArrayList<Student1> arraylist = new ArrayList();
	 
		Scanner scan = new Scanner(System.in);
        
		System.out.println("how many students");
        
		int n=  scan.nextInt();
        
        
		for(int i = 0;i<n;i++)
        {
	     int  id1 = scan.nextInt();
	    
	     String  name1 = scan.next();
       	 
	     double  cgpa1 = scan.nextDouble();
	     
	     
	     arraylist.add(new Student1(id1,name1,cgpa1));
	 		
        }
		
		Collections.sort(arraylist, new Comparato());

		 Iterator itr = arraylist.iterator();
		 while(itr.hasNext())
		 {
			 Student1 st = (Student1) itr.next();
			 System.out.println(st.name);
		 }
 		  	}
	
}
