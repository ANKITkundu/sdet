package Session4java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Activity4_1 {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		ArrayList<Integer> arrL1= new ArrayList<>();
		Random randomno=new Random();

        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");
		while(Scan.hasNextInt()) {
		    arrL1.add(Scan.nextInt());
        Integer nums[] = arrL1.toArray(new Integer[0]);
        int index = randomno.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        Scan.close();
        
		

	}

	}
}
