package ArrayList;

import java.util.ArrayList;

public class Container {
        int maxWater = 0;

        //Brute Force Approach
        public static int storeWater(int height[]){

            int maxWater = 0;

            for(int i=0 ; i<height.length ; i++){
                for (int j= i+1 ; j<height.length ; j++ ){
                     int width = j-i;
                     int ht = Math.min(height[i], height[j]);
                     int currWater = width * ht ; 
                    maxWater = Math.max(currWater, maxWater);
                }
            }
            return maxWater;
        }
        // Better approach using 2 pointer
        public static int storeWater_Better(ArrayList<Integer> height){
            int lp = 0, rp = height.size()-1;

            int maxWater = 0;
            while(lp<rp){
                int ht = Math.min(height.get(lp), height.get(rp));
                int width = rp-lp;
                int currWater = width*ht;
                maxWater = Math.max(currWater, maxWater);

                if(height.get(lp)<height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }
            }
            
                return maxWater;
        }

        public static void main(String[] args) {
            ArrayList<Integer> height = new ArrayList<>();
            height.add(2);
            height.add(5);
            height.add(6);
            height.add(4);
            height.add(2);
            
            int value = storeWater_Better(height);
            System.out.println(value);
        }
}
