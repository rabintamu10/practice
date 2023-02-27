import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };

		// 2,4,6,8,10,122

		// Check if array is the multiple of 2
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break;
			} else {
				System.out.println(arr2[i] + "is not multiple of 2");
			}

		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("rabin");
		a.add("Gurung");
		a.add("Academy");
		a.add("selenium");
		a.remove(3);
	

		System.out.println(a.get(0));
		System.out.println(a.get(1));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("*************");
		// Enhanced loop
		for (String val : a) {
			System.out.println(val);
		}

		// Item is present in Arraylist
		System.out.println(a.contains("selenium"));
		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("selenium");

		// create object of the class object.method

	}

}
