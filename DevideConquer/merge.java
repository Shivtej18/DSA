package DevideConquer;

public class merge{

    static int inversionCount = 0;

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+ (ei-si)/2; //or mid=si+ei/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        mergeElements(arr, si, mid, ei);
    }

    public static void mergeElements(int arr[], int si,int mid, int ei) {
        int[] temp = new int[ei-si+1];  
        int i = si;     //idx for left iterator 
        int j = mid+1;  //idx for right iterator
        int k = 0;      //idx for temporary array iterator
        

        while(i<=mid && j<=ei){     //compare divided array and sort in temp array.
            if(arr[i]<arr[j]){  
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                //inversion count
                inversionCount += mid-i+1;
                j++;
            }
            k++;
        }

        while(i<=mid){          //For leftover elements of 1st sorted part
            temp[k] = arr[i];
            k++; i++;
        }
        while(j<=ei){       //For leftover elements of 2nd sorted part
            temp[k] = arr[j];
            k++; j++;
        }

        for( k=0, i=si; k<temp.length; i++, k++ ){ //copy temp to original array;
            arr[i] = temp[k];
        }


    }
    
    public static void main (String args[]){

        int arr[] = {8,4,9,3,6,-1};
        int ei= arr.length-1;
        mergeSort(arr,0,ei);
        printArray(arr);
        System.out.println("Inversion count is: "+inversionCount);
    }
}
