public class subarray {

    public static void sub(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<=array.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                } 
                System.out.println();
            } System.out.println();
        }   
     }


    public static void main(String args[]){
         int array[] = {12,34,5,76,93};
         sub(array);

    }
}
