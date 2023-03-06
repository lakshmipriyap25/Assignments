package week2.day2;
import java.util.Arrays;
public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
      int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};

     Arrays.sort(array);
     System.out.println("Duplicates values in Array:");
	 int count = array.length;
		for(int i=0;i<count-1;i++) 
		{
			for(int j=i+1; j<count;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value

	}

}
}
