package Session1java;

import java.util.*;

public class Activity1_2 {

	public static void main(String[] args) {
	      
		int[] numarray= {10,77,10,54,-11,10};
		System.out.println("OriginalArray:"+ Arrays.toString(numarray));
		int Searchnum=10;
		int FixedSum=30;
		System.out.println("Result:"+ result(numarray,Searchnum,FixedSum));
		}
	public static boolean result (int[] numbers,int Searchnum,int FixedSum) {
		int tempsum=0;
		for (int number:numbers) {
			if (number==Searchnum) 
			{
				tempsum += Searchnum;
			}
			if (tempsum>FixedSum) {
				break;	
			}
		}
		return tempsum==FixedSum;
		
	}

}
