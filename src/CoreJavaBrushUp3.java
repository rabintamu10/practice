
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// String is an object that represent the sequence of the character 
		
		//string is an object //String literal
		
		//String s1 = "Rabin Gurung academy";
		String s5 = "hello";
		
		//new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "Rabin Gurung Academy";
		String s1 = "Rabin Gurung Academy";
		String[] splittedString = s.split("\\s+");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2].trim());
		for(int i = s.length()-1;i>=0;i--)
		{
			
			System.out.println(s.charAt(i));
		}

	}

}
