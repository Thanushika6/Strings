import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] line = word.trim().split("\\s+");
        int count = (word.trim().isEmpty())?0:line.length;
        System.out.print(count);
    }
}
