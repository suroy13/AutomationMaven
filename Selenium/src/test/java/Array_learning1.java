//Learning Array
public class Array_learning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age = new int[4];
		age[0] = 1;
		age[1] = 2;

		int age1[] = { 1, 2, 3, 4, 5, 6 };

		// For Loop for Int Age1);

		for (int i = 0; i < age1.length; i++) 
		{

			System.out.println(age1[i]);
		}
		
		// For Loop for String Name;
		
		String [] name= {"Subhakar", "Babai", "Subho"};
		for (int i = 0; i < name.length; i++) 
		{

			System.out.println(name[i]);
		}
		
		for (String s: name) {
			
			if (s.equalsIgnoreCase("Subho")) {
				
				System.out.println("The Name matched, Thank you!: "+s);
			}
			else {
				System.out.println("Sorry No Match " + s);
			}
			
			
		}
		
	}

	public String getname(String s) {
		// TODO Auto-generated method stub
		
		String s1=s;
		return s1;
		
	}

}
