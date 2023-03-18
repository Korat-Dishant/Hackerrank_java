import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		
        Scanner scan = new Scanner(System.in);

        int n =scan.nextInt();
        String regex[] = new String[n] ;

        scan.nextLine();

        for(int i=0 ; i< n ; i++)
        {
            regex[i] = scan.nextLine();

        }
        
        for(int i= 0 ; i< n ; i++)
        {

            try
            {
    
                // System.out.println("regx = "+regex[i]);
              Pattern pat = Pattern.compile(regex[i]);
            // Pattern pattern = Pattern.compile(regex);
    
              System.out.println("Valid");
    
            }
            catch (PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }
        }
		
	}
}



