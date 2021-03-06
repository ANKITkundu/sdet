package Session1java;
import java.util.Arrays;
class Activity1_4 {
		    static void ascendingSort(int array[]) {
		        int size = array.length, i;
		        
		        for (i = 1; i < size; i++) {
		            int key = array[i];
		            int j = i - 1;
		            
		            while (j >= 0 && key > array[j]) {
		                array[j + 1] = array[j];
		                --j;
		            }
		            array[j + 1] = key;
		        }
		    }
		    
		    public static void main(String args[]) {
		        int[] data = { 1,3,4,5,9 };
		        ascendingSort(data);
		        System.out.println("Sorted Array in Ascending Order: ");
		        System.out.println(Arrays.toString(data));
		    }
		
	}


