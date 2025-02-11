import java.util.*;
public class b_search {
        static int bsearch_recurs(int arr[], int left, int right, int n) {
        	if(left > right) {
        		return -1;
        	}
        	int mid =left + (right - left) / 2;
        	
        	if(arr[mid] == n) {
        		return mid;
        	}
        	if(n < arr[mid]) {
        		return bsearch_recurs(arr, left, mid - 1,n);
        	}
        	return bsearch_recurs(arr,mid+1,right,n);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = sc.nextInt();
		
		int res = bsearch_recurs(arr,0,arr.length - 1,n);
		
		if(res != -1) {
			System.out.println("element found at" + res);
		}else {
			System.out.println("element not found");
		}

	}

}
					