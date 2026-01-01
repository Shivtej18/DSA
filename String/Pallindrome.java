package String;

public class Pallindrome {
    public static boolean isPallindrome(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "abaa"; 
        boolean isPal = isPallindrome(str1);
        System.out.println(isPal);
    }
}
