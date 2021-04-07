import java.math.BigDecimal;

class BigDecimal{

    public static void main(String[] args) {
        String[] s ={"9","-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        String temp=null;

        for(int i =0; i<s.length-1; i++){
          for(int j=i+1; j<s.length; j++){
            BigDecimal b1 = new BigDecimal(s[i]);
            BigDecimal b2 = new BigDecimal(s[j]);
              if ( b1.compareTo(b2) < 0 ){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;

              }
          }
            
        }

        for(String st: s){
            System.out.println(st);
        }

    }
  


}