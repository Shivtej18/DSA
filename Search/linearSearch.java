package Search;
public class linearSearch {
    public static int linSearch(int array[],int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("key found");
                return i;
            }else{
                System.out.println("no match found");
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int array[] = {3,5,12,45,67};
        
        int targetele = linSearch(array,12);
        System.out.println("At index : " + targetele);
    }
}
