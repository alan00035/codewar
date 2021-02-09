// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Hashtable;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;

// public class GreedisGood {

//     public static int greedy(int[] dice){

//        HashMap<Integer, Integer> map = new HashMap<>();
//        Hashtable table = new Hashtable<>();

//        for(int i =0; i<dice.length; i++){
//         map.put(i, dice[i]);
//         int count = Collections.frequency(map.values(), dice[i]);

//         table.put(dice[i], count);
//      }
//     //  System.out.println(  table);

//      HashMap<Integer,Integer> mapPoint = new HashMap<>();
//      mapPoint.put(1, 1000);
//      mapPoint.put(2, 200);
//      mapPoint.put(3, 300);
//      mapPoint.put(4, 400);
//      mapPoint.put(5, 500);
//      mapPoint.put(6, 600);

//      int point1=0,point2_1=0,point2_2=0,point3_1=0,point3_2=0;

//      for(int a :dice ){
//         int count2= (int)table.get(a);

//          if( count2 == 3){
//                 point1 = mapPoint.get(a);
//          }
//          if( count2 <3 && a==1 ){
//               point2_1 = 100 *(count2);
//          }
//          if(count2 <3 && a==5){
//               point2_2 =50*(count2);
//          }
//          if(count2 >3 && a==1){
//              point3_1 = mapPoint.get(a) + 100*(count2-3);
//          }
//          if(count2 >3 && a==5){
//             point3_1 = mapPoint.get(a) + 50*(count2-3);
//         }
//   }
        
//         int total = point1+point2_1+point2_2+point3_1+point3_2;
//         System.out.println(total);
//         return total;
//       }

//       public static int greedy2(){
//         int[] dice = {6,6,6,1};

//         int n[] = new int[7];
//         for (int d : dice) 
//         n[d]++;
//         // return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
     
//         System.out.println(n[2]%3);
    
//         return 0;
//     }
// }