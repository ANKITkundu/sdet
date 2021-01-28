package Session3java;
import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet <String>();
		hs.add("Mango");
		hs.add("Guava");
		hs.add("Papaya");
		hs.add("Peach");
		hs.add("Orange");
		hs.add("Custard");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove("Papaya"));
		System.out.println(hs);
		System.out.println(hs.contains("Papaya"));
		System.out.println(hs.contains("Orange"));
		System.out.println(hs);
		
		

	}

}
