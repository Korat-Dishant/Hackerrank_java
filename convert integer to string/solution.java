import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
   
        Scanner scan = new Scanner(System.in);

        try
        {
            int i ;
            String s ;
            i = scan.nextInt() ;
            // s = String.valueOf(i);
            s = Integer.toString(i);
            System.out.println( "Good job");


        }
        catch (Exception e )
        {
            System.out.println("Wrong answer");
        }
   
   
   
   
    }
}