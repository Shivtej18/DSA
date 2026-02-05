package Recursion;

public class Problems {
    
    public static int Factorial(int n){

        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);

    }

    public static int SumOfN(int n){
        if(n==1){
            return 1;
        }
        return n+ SumOfN(n-1);
    }

    public static void main(String args[]){
        int Ans = Factorial(4);
        System.out.println(Ans);

        int Sum = SumOfN(5);
        System.out.println(Sum);

    }
}
