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

    public static int tilingProblem(int n){
        if(n==1 || n==0) return 1;

        int fnm1 = tilingProblem(n-1); //Vertical tiling
        int fnm2 = tilingProblem(n-2); //Horizontal tiling

        int total_tiling = fnm1 + fnm2;

        return total_tiling;
    }

    public static int tilingProblem22Board(int n){
        if(n==1 || n==0 ||n==2) return 1;

        int fnm2 = tilingProblem(n-2); //tiling 2*2

        return fnm2;
    }

    public static int friendsPairing(int n) {               // Qn13 Goldman Sachs
         if(n==1 || n==2) return n;
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2); 
    }

    public static void main(String args[]){
        // int Ans = Factorial(4);
        // System.out.println(Ans);

        // int Sum = SumOfN(5);
        // System.out.println(Sum);

        // int tiling = tilingProblem(4);
        // System.out.println(tiling);

        int ways_toPair = friendsPairing(3);

        System.out.println(ways_toPair);


    }
}
