import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] alpha = new int[256];
        
        for(int i=0;i<word.length();i++){
            alpha[word.charAt(i)]++;
        }
        for(int i=0;i<word.length();i++){
            if(alpha[word.charAt(i)]==1){
                System.out.println(word.charAt(i));
                return;
            }
            
        }
    }
}
