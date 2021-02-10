import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Directions_Reduction{
    public static String[] dirReduc() {
        
        String[] arr = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","NORTH"};
        int oldLength = arr.length;
        int newLength =0;

        while( oldLength != newLength){
        oldLength = arr.length;
        arr = arrCheck(arr);
        newLength = arr.length;
       
        }
        System.out.println(arr[0]);
        return arr;
    }



    public static String[] arrCheck(String[] a)  {
        int n = a.length;
        List<String> list = new ArrayList<>();
        List<String> listNew= new ArrayList<>();

        if( n <=1){
            return a;
        }

        for(String str: a){
            list.add(str);
        }

        /**max value of i has to be n-1; otherwise the next var "i+1" will be out of index
         * array length should be same and letter cannot be identical, thats the condition to remove the pair
         * the new array list after first check has to keep running till there is nothing to reduce anymore.
         * if the array has one or null element at the begining, return the original list
         */
        for(int i =0; i<n; i++){
            if(i != n-1 && list.get(i).length()==list.get(i+1).length() && !list.get(i).equals(list.get(i+1))){
                i++;
            }
            else{
                listNew.add(list.get(i));
            }
            
        }
       

        Object[] objArr = listNew.toArray();
        String[] strArr = Arrays.copyOf(objArr, objArr.length, String[].class);

        // System.out.println(listNew);
        return strArr;

     }


    public static void main(String[] args) {
        Directions_Reduction a = new Directions_Reduction();
        a.dirReduc();
    }


}
