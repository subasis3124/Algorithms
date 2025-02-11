import java.util.*;
public class l_search_recursion {
	static int r_l_search(int arr[],int n, int i ) {
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == n) {
			return i;
		}						
		
		return r_l_search(arr,n,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your desire number");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = sc.nextInt();
		
		int res = r_l_search(arr,n,0);
		
		if(res != -1) {
			System.out.println("element found in index " + res);
		}
		else {
			System.out.println("element not found");
		}

	}

}
