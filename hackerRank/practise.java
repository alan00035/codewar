

import java.math.BigInteger;

import jdk.nashorn.internal.parser.Token;

public class practise {
   public static void main(String[] args){


      BigInteger bigInt = BigInteger.valueOf(Integer.parseInt("13"));

      if( bigInt.isProbablePrime(10) == false){
         System.out.println("not prime");
      }
      else {
         System.out.println("prime");
      }

   



       
   }


}


