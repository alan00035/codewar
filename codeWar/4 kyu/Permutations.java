import java.util.ArrayList;
import java.util.List;

class Permutations {
    
    public static List<String> singlePermutations(String s) {
        
        List<String> a = new ArrayList<>();

        int count = s.length();

        for(int i=0; i<count; i++ ){
            char b = s.charAt(i);
            System.out.println(b);
        }



        return null;

    }

    public static void main(String[] args) {
        Permutations a = new Permutations();
        a.singlePermutations("niu niu");
    }
}