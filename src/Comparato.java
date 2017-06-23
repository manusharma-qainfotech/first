import java.util.Comparator;

public class Comparato implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.cgpa==o2.cgpa)
		{
			 int i =o1.name.compareTo(o2.name); 
			 
			if(i==0)
			{ 
				if(o1.id==o2.id)
				{
					return 0;
				}
				
				else if(o1.id>o2.id)
				{
					return 1;
				}
				
				    else
					return -1;
				
			}
			else if(i>0)
			{
				return 1;
			} 
			else
				return  -1;
			
		}   
		  else if(o1.cgpa>o2.cgpa)	
			return -1;
		    
		  else  
			return 1;
		
	}

}
