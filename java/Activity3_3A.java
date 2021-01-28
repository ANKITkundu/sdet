package Session3java;
import java.util.HashMap;

public class Activity3_3A {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Violet");
		hash_map.put(4,"yellow");
		hash_map.put(5,"Green");
		System.out.println(hash_map);
		hash_map.remove(4);
		System.out.println("After Removal of yellow:" +hash_map);
	    System.out.println("Checking if green Colour exist:"+hash_map.containsValue("Green"));
	    System.out.println("The size of the map is:"+hash_map.size());
	}

}
