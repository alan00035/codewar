import java.util.ArrayList;
import java.util.List;

class Directions_Reduction{
    public static String[] dirReduc() {
        
        String[] a = {"North","South","West","East"};
        int n = a.length;
        List<String> list = new ArrayList<>();
        List<String> listNew= new ArrayList<>();

        if( n <=1){
            return a;
        }

        for(String str: a){
            list.add(str);
        }

        for(int i =0; i<n; i++){
            if(i != n-1 && list.get(i).length()==list.get(i+1).length()){
                i++;
            }
            else{
                listNew.add(list.get(i));
            }
            
        }
       

        System.out.println(listNew);


        return new String[] {};
    }


    public static void main(String[] args) {
        Directions_Reduction a = new Directions_Reduction();
        a.dirReduc();
    }


}