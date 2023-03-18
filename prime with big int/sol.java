import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    BigInteger i = scan.nextBigInteger() ;
    // i = scan.nextBigInteger() ;
    
    if(i.isProbablePrime(1))
    System.out.println("prime");
    else System.out.println("not prime");




  }
  
}