import java.lang.*;
import java.io.*;
import java.util.*;

public class fl
{

    public static void main(String[] args) {
        

        
     try {
        
    
        File fll = new File("inp.txt");
        Scanner scan = new Scanner(fll);

        int i = 0; 
        int fdata = scan.nextInt();
        int sdata = scan.nextInt();
        System.out.println("first data = "+fdata); 
        System.out.println("second  data = "+sdata); 
     
        while (scan.hasNextInt())
        {
            int data = scan.nextInt();
            System.out.println("line "+i+" = "+data);
            i++ ;
        }
        scan.close();
    } 
    catch (FileNotFoundException e) {
        System.out.println("An error has occurred.");
        e.printStackTrace();
    }






    
}


















// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class fl {
// 	public static void main(String[] args)
// 	{
// 		try {
// 			File fll = new File("read.txt");
// 			Scanner scan = new Scanner(fll);
// 			while (scan.hasNextLine()) {
// 				String data = scan.nextLine();
// 				System.out.println(data);
// 			}
// 			scan.close();
// 		}
// 		catch (FileNotFoundException e) {
// 			System.out.println("An error has occurred.");
// 			e.printStackTrace();
// 		}
// 	}
// }
