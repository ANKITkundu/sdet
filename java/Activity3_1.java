package Session3java;
import java.util.ArrayList;
public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> arrL1= new ArrayList<>();
        arrL1.add("Ankit");
        arrL1.add("Java");
        arrL1.add("Sabita");
        arrL1.add("Good");
        arrL1.add("let");
        System.out.println(arrL1);
        System.out.println(arrL1.get(2));
        System.out.println(arrL1.contains("Good"));
        System.out.println(arrL1.size());
        System.out.println(arrL1.remove("Java")); 
        System.out.println(arrL1.size());

	}

}
