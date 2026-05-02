import java.util.Arrays;

public class runningSum {
    
    public static void prefixSum(int arr[]){
        int n = arr.length;
        int[] sumArr = new int[n];
        
        for(int i=0; i<n ; i++){
            sumArr[i] = 0;
        }

        sumArr[0] = arr[0];

        for(int i=1; i<n ; i++){
            sumArr[i] = sumArr[i-1] + arr[i] ;
        }

        System.out.println(Arrays.toString(sumArr));
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        // o/p={1,3,6,10}
        prefixSum(arr);

    }
}
