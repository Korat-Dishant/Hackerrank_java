import java.io.*;
import java.util.*;

public class sol {

    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        String s;
        int siz=0;
        int count= 0 ; 


     
        ArrayList ar = new ArrayList();
        int e = 1;
        while ( scan.hasNext() )
        {
            String data = scan.nextLine();



            // if (!(data.contains("\n")))
            if(!data.isBlank())
           { ar.add(data); } 
            count++;   
        }

        // System.out.println("size of array list = "+ar.size());
        // System.out.println("alist 0 = "+ar.get(0));
        // System.out.println("alist 1 = "+ar.get(1));
        // System.out.println("alist 2 = "+ar.get(2));
        

        String arp;
        String dt[];

        for ( int i = 0 ; i < ar.size() ; i++ )
        {
            arp = ar.get(i).toString();

            dt = arp.split("[ !,?._'@]+");
            
            for (int k =0 ; k < dt.length ; k++ )
           {        if(!dt[k].isBlank())
                    {siz++;}
                    // { siz = siz+dt.length; } 
           }
            
        }


        // System.out.println((siz+count)-1);
        System.out.println((siz));


        for ( int i = 0 ; i < ar.size() ; i++ )
        {
            arp = ar.get(i).toString();

            dt = arp.split("[ !,?._'@]+");

            // siz = siz+dt.length;

            for(int j = 0 ; j < dt.length ; j++ )
           { 
                if(!dt[j].isBlank())
                {  System.out.println(dt[j]); } 
           }
        }







    //    String sp[] = s.split("[ !,?._'@]+");

    //     siz = sp.length;
    
    //     for(int i = 0 ; i < siz ; i++ )
    //     System.out.println(sp[i]);
   
   
   
   
   
   
   
    }
}
