

import java.math.BigInteger;

import jdk.nashorn.internal.parser.Scanner;
import jdk.nashorn.internal.parser.Token;

public class practise {
   public static void main(String[] args){


      BigInteger bigInt = new BigInteger("2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983");

      if( bigInt.isProbablePrime(10) == false){
         System.out.println("not prime");
      }
      else {
         System.out.println("prime");
      }

   



       
   }


}


