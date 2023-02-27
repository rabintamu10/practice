
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();

		// This is how we can catch a string return type i line 21.
		String name = d.getData();
		System.out.println(name);

		// Creating an object for another class
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
	}

	public String getData() {
		System.out.println("Hello World");
		return "Rabin Gurung";
	}

	// when we mark as a static keyword, static will move methods to class level and
	// we can access methods without creating an object of the class.
	public static String getData2() {
		System.out.println("Hello World");
		return "Rabin Gurung";
	}
}