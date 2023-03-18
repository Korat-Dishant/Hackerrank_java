import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String m = scan.nextLine();
        int s = scan.nextInt();
        int e = scan.nextInt() ;
    
    
        System.out.println(" m = "+m+"\ns = "+s+"\n e = "+e);
    
        System.out.println(m.substring(s,e));
    }
}