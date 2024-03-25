
public class Stringclass {

	public static void main(String[] args) 
	{

		String s = "Welcome to The world of learning";

		// Split the string into an array of substrings using space as the delimiter
		String[] splitteds = s.split(" ");

		// Loop through each element in the splitteds array

		for (int i = 0; i < splitteds.length; i++) 
		{
			// Print the current substring
			System.out.println(splitteds[i]);
		}

		System.out.println(s.toUpperCase());

		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println(s.length());
		System.out.println("--------------------------------------------------");
		
		for (int i = s.length() -1; i > 0; i--) 
		{
			System.out.println(s.charAt(i));
		}
		
		Array_learning1 a1=new Array_learning1();
		String s2=a1.getname("Subhankar Trying Automation");
		System.out.println(s2);
		

	}

}
