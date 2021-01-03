import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class practise {
   public static void main(String[] args){
       String returnDate = "9 6 2015";
       String dueDate = "6 6 2015";
    
       StringTokenizer token = new StringTokenizer(returnDate);
       while(token.hasMoreElements()){
           int returnDay = Integer.parseInt( token.nextToken());
           int returnMonth= Integer.parseInt( token.nextToken());
           int returnYear = Integer.parseInt( token.nextToken());

           System.out.println(returnDay +"+ "+returnMonth +"+"+ returnYear);
       }
       
   }


}


