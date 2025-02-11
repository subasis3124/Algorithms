import java.util.*;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,4,5,7,8};
		System.out.println("enter desire no.");
		int n = sc.nextInt();
		int i = 0;
		for( i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				System.out.println("element = " + i);
			}
		}
		if(i== arr.length) {
			System.out.println("element not found");
		}
		

	}

}
