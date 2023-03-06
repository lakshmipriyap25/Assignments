package week2.day2;
import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] Array = {1,2,3,4,7,6,8};
		Arrays.sort(Array);
		
		int num = Array.length+1;
		
		int sum=(num*(num+1)/2);
		
		for (int i=0;i<Array.length;i++) 
		{
			sum= sum-Array[i];
		}
		System.out.println("Missing Number is:" +sum);
		
		}
	
		
}


