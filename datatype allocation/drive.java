import java.io.*;
import java.util.*;
import java.io.*;

public class drive {
    static void check (String ck)
    {
        // byte short int long
    try{
        byte bb =Byte.parseByte(ck);
        System.out.println("* byte");
        }
    catch(NumberFormatException e)
    {        }
    try{
        short sh =Short.parseShort(ck);
        System.out.println("* short");
        }
        catch(NumberFormatException e)
        {      }
    try{
        int in =Integer.parseInt(ck);
        System.out.println("* int");
        }
        catch(NumberFormatException e)
        {       }       

    }

    public static void main(String[] args) {
      
        // Scanner scan = new Scanner(System.in);      
        /////////////////////////////// input /////////////////////////////////////////////////////////////////
        
        try
        {
                File fl = new File("inp.txt");
                Scanner fscan = new Scanner(fl);
                int rep = fscan.nextInt();
            
        
            // int rep = 1;
            String ip[]= new String[rep];

            if (rep > 0)
            {
                fscan.nextLine();
                for (int i=0 ; i<rep ; i++)
                {
            /////////////////////////////// input /////////////////////////////////////////////////////////////////
                    ip[i]= fscan.nextLine();
                }


                fscan.close();


                for(int i=0; i<rep ; i++)
                {  if (ip[i].matches("-[0-9]+") && ip[i].length() > 0) 
                    {
                        try{
                            long lo =Long.parseLong(ip[i]);
                            System.out.println(ip[i]+" can be fitted in:");
                            check(ip[i]);

                            System.out.println("* long");
                            }
                            catch(NumberFormatException e)
                            {    System.out.println(ip[i] +" can't be fitted anywhere.");  } 
                
                    }

                    if (ip[i].matches("[0-9]+") && ip[i].length() > 0) 
                    {
                        try{
                            long lo =Long.parseLong(ip[i]);
                            System.out.println(ip[i]+" can be fitted in:");
                            check(ip[i]);

                            System.out.println("* long");
                            }
                            catch(NumberFormatException e)
                            {    System.out.println(ip[i] +" can't be fitted anywhere.");  } 
                
                    }

                }
            }

        }
        catch (Exception e)
        {
            System.out.println("exception acacured = "+e);
        }
        // System.out.println(ip[0]);

    }
}