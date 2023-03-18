import java.io.*;
import java.util.*;
import java.math.*;

class data
{
    int a;
    int b;
    int n;


    int pri(int nj)
    {
    
        if ( nj ==0)
        {
            return b;
        }

      return (b* (int)Math.pow(2,nj) )+pri(nj-1);
        



    }

}


public class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);

        data s[];
        int q = scan.nextInt();
        s = new data[q];

        // data o = new data();
        for (int i=0 ; i<q ; i++)
        {
            s[i]= new data();
            s[i].a= scan.nextInt();
            s[i].b= scan.nextInt();
            s[i].n= scan.nextInt();

        }
    
        for (int i=0; i<q ; i++)
        {
            // System.out.println();
            for(int j=0 ; j<s[i].n ; j++)
            {
               System.out.print((s[i].a+s[i].pri(j))+" ");
            }
            System.out.println();
        }
       
    
    }
}




































