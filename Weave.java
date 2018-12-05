import java.util.*;

public class Weave {

   public static void main(String[] args) {
      int[] a1 = {1,2,3,4,5,5,6,7,8};
      int[] a2 = {5,5};
      System.out.println(Arrays.toString(interleave(a1, a2)));
      
   }
   
   public static int[] weave(int[] a1, int[] a2) {
      int[] results = new int[a1.length + a2.length];
      int count = 0;
      
      for (int i = 0; i < results.length - 1; i++) {
         if (count < a1.length - 1 && count < a2.length -1) {
            results[i] = a1[count];
            results[i + 1] = a2[count];
         } else if (count >= a2.length) {
            results[i] = a1[count];
            i--;
         } else if (count >= a1.length) {
            results[i] = a2[count];
            i--;
         } 
         count++;
      }
      return results;
   }
   public static int[] interleave(int[] a1, int[] a2) {
     int bounds = Math.min(a1.length, a2.length);
     int[] result = new int[bounds * 2];
     int index = 0;
     for (int i = 0; i < bounds; i++) {
       result[index++] = a1[i];
       result[index++] = a2[i];
     }
     return result;
}
}