import java.util.*;
public class max_sum_sub {
	public static void main(String [] args) {
		int arr[] = {1,2,5,-3,4,5,-1,5,6,4,8};
		
		int sum = largsubsum(arr);
		
		System.out.println("maximum sum = " + sum);
	}
	public static int largsubsum(int[] arr) {
		int cs = 0;
		int sum = Integer.MIN_VALUE;
		
		for(int num : arr)  {
			cs += num;
		}
		if(cs > sum) {
			sum = cs;
		}
		if(cs < 0) {
			cs = 0;
		}
		return sum;
	}
	

}
