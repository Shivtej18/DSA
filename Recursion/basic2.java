package Recursion;

import java.util.Scanner;

public class basic2 {
    static void printNumber(int i, int n){
        if(i>n){
            return;
        }else{
            System.out.println(i);
            printNumber(i+1, n);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n = sc.nextInt();
        System.out.println("calling function");
        printNumber(1, n);

    }
}
