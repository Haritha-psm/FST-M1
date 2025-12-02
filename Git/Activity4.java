package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int array[] = {10,20,30,25,35,45};
		
		ascendingSort(array);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));
    }
		static void ascendingSort(int array[]) {
	        int size = array.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }

	}

}
