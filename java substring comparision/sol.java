import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        String s = scan.nextLine();
        int k = scan.nextInt();

        int part = s.length()-(k-1) ;

        String list[] = new String[part];
        


        for (int i =0 ; i< part ; i++)
        {
            list[i]= s.substring(i, i+k) ;
            System.out.println("\n"+list[i]);

        }

        String hi = list[0];
        String lo = list[0];
    
        int cmp ;
        for (int i = 0 ; i < part ; i++)
        {

            cmp = hi.compareTo(list[i]) ;
            if( cmp <= 0  )
            {
                hi = list[i] ; 
            }

            cmp = lo.compareTo(list[i]) ;
            if(cmp > 0)
            {
                
                lo = list[i] ;
            }
           

        }

        System.out.println("\n\n\n hi = "+hi+"\nlo = "+lo);

    
    
    
    
    
    
    
    
    
    
    
    }
}


















// //
// /*




// 4 5 2 8 3 4 5

// a = 4 
// lo = a 

// */







// public class Solution {

//     public static void main(String[] args) {
        

//         int a[] = {3,5,2,9,4,1,8};
//         int hi = a[0];
//         int lo = a[0];
//         for (int i = 0 ; i < a.length ; i++)
//         {
//             if (hi<a[i])
//             hi=a[i];

//             if(lo>a[i])
//             lo=a[i];
//         }

//         System.out.println("hi = "+hi+" lo  ="+lo);



//     }

    
// }