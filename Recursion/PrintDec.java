package Recursion;

import java.nio.channels.Pipe.SourceChannel;

class PrintDec{

    public static void Dec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+"");
        Dec(n-1);
    }
    

    public static void main(String args[]){
        Dec(5);
    }
}