package ArrayList;

import java.util.*;

public class MultiD {
    public static void main(String args[]){

        //Arraylist of arraylist declaration.
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0 ; i<5 ; i++){
            list1.add(i*1);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for( int i= 0 ; i<5 ; i++){
            list2.add(i*2);
        }

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i<5 ; i++){
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        
        System.out.println(mainList);

        list2.remove(list2.size() - 1);
        list2.remove(list2.size() - 1);
        for(int i=0; i<mainList.size() ; i++){
             ArrayList <Integer>currArray = new ArrayList<>();

             currArray = mainList.get(i);

             for(int j = 0; j< currArray.size(); j++){
                System.out.print(currArray.get(j)+ "  ");
             }
             System.out.println();
        }
    }
}
