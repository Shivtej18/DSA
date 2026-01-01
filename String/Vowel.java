package String;
import java.util.Scanner;



public class Vowel{
    
    public static boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static int countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length() ;i++){
            if(isVowel(str.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countVowel(str)); 
        sc.close();
    }
}