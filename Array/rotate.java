package Array;
                                    //rotate array by one place:---
import java.util.*;

public class rotate {

    public static int[] rotateByOne(int[] arr) {
      int temp = arr[0];
      int n=arr.length;
      for(int i=1;i<n;i++){
        arr[i-1] = arr[i];
      }
      arr[n-1] = temp;

      return arr;
   }
       
   public static void main(String[] var0) {
      int[] arra = {1, 4, 6, 8, 9, 10};
      arra = rotateByOne(arra);
      System.out.println("ratated array is : " + Arrays.toString(arra));
   }

}
