package Array;
import java.util.*;

public class rotateByK {
    public static void rotate(int[] array, int k){
        int n =array.length;
        k=k%n;

        array = reverse(array,0,k-1);
        array = reverse(array,k,n-1);
        array = reverse(array,0,n-1);

        System.out.println("Rotated  array is : "+ Arrays.toString(array));
    }

    public static int[] reverse(int[] array,int start , int end) {
        int temp;
        while(start<end){
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,34,5,7,8};
        rotate(array,3);
    }
}
