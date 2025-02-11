import java.util.*;
public class n_num_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of element");
		int n = sc.nextInt();
		
		int sum = 0;
		System.out.println("enter" + n + "numbers");
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			 sum += num;			
		}
		System.out.println("sum = " + sum);

	}

}
