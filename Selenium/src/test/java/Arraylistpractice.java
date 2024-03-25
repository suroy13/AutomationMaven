import java.util.ArrayList;

public class Arraylistpractice 
{

	public static void main(String[] args) 
	{
		ArrayList<String> s= new ArrayList<String>();
		s.add("Subhankar");
		s.add("Avik");
		s.add("Vikram");
		s.add("Rajesh");
		s.add("Sounak");
		System.out.println(s.get(1));
		// TODO Auto-generated method stub
		
		for (int i=0;i <s.size();i++) 
		{
			if (s.get(i).equalsIgnoreCase("Vikram"))
			{
				System.out.println("The name has been identified from the DB, its :" + s.get(i));
			}
			else 
			{
				System.out.println("The name is not there in the list  ");
			}
			
		}

	}

}
