import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();

        
        // Character c[] = {'a','n','c'};
        char c[] = new char[s.length()];
        // System.out.println("c[0]" + c[0]);

        int len = s.length();
        for (int i = 0 ; i< len ; i++)
        {

            c[i] = s.charAt((len-1)-i);

        }

        System.out.println("\n\n\n rev = "); 

        String rev = String.copyValueOf(c);

        System.out.println("rev ="+rev);

        if (rev.equals(s))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}