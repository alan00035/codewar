

public class twoSum {
    public int[] solution(int[] nums, int target){
        
        int length = nums.length;
        int[] a = new int[2];
        
        
        for(int i =0; i< length-1; i++){
            for(int n=i+1; n< length; n++){
                
                if(nums[i]+nums[n] == target){
                    a[0]=i;
                    a[i]=n;
                System.out.println(a[0] + "   " +a[1]);
                }

             
            }
        
        }


        return a;

        
    }

    public static void main(String[] args) {
        twoSum a = new twoSum();
        int[] nums= {1,3,4};
        a.solution( nums , 5);
    }


}
