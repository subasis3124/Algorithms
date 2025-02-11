public class RotateArrayKPosition {
    public static int[] rotate(int arr[],int k) {
        k = k % arr.length;
        reverse(arr,0,arr.length - 1);
        reverse(arr,k,arr.length - 1);
        reverse(arr,0,k - 1);

        return arr;
    }

    public static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};
        int k = 2;
        int result[] = rotate(arr, k);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
    
}
