// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
     
//             ArrayList ar = new ArrayList();
//             // ar.add("hi");
//             // ar.add("there");
//         int e = 1;
//             while ( e != 0 )
//             {
//                 String data = scan.nextLine();
//                 if( !(data.equals("EOF")) )
//                 ar.add(data);
//                 else { e = 0 ;}
            
            
//             }

//             // System.out.println(ar);

//             for ( int i = 0 ; i < ar.size() ; i++ )
//             {
//                 System.out.println((i+1)+" "+ar.get(i));
//             }











//     }
// }























































import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
     
            ArrayList ar = new ArrayList();
            // ar.add("hi");
            // ar.add("there");
        int e = 1;
            while ( scan.hasNext() )
            {
                String data = scan.nextLine();
                //if( !(data.equals("EOF")) )
                ar.add(data);
                //else { e = 0 ;}
            
            
            }

            // System.out.println(ar);

            for ( int i = 0 ; i < ar.size() ; i++ )
            {
                System.out.println((i+1)+" "+ar.get(i));
            }











    }
}