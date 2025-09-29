package Recursion;

import java.util.Scanner;

public class basic{
    //Print name n time
    static void printName(int i, int n){
        if(i>n){
            return;
        }else{
            printName(i+1, n);
            System.out.println("Shivtej");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("calling function");
        printName(1, n);

    }
}