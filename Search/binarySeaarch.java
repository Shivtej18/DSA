package Search;
public class binarySeaarch {
    public static int binaryS(int array[], int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
           int mid=(start+end)/2;
            if(array[mid]==target){
                System.out.println("target found at :"+mid);
                return mid;
            }else if(array[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int array[] = {1,4,6,8,9,10};
        int index= binaryS(array,8);
        System.out.println("Target element is at index :" + index);
    }
}
