import java.util.*;
public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("enter the numbers");
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt(); 
		}
		int min = num[0];
		int max = num[0];
		
		for(int i = 0; i < n; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("minimum = " + min);
		System.out.println("maximum = " + max);
	}

}
