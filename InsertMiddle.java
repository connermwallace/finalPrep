import java.util.*;

public class InsertMiddle {
   public static void main(String[] args) {
      int[] a = {2, 4, 6, 8, 10};
      int[] b = {1, 1, 1};
      insertMiddle(a, b);
   }
   
   public static int[] insertMiddle(int[] a, int[] b) {
      int[] results = new int[a.length + b.length];
      
      for (int i = 0; i < a.length / 2; i++) {
         results[i] = a[i];
      }
      for (int i = 0; i < b.length; i++) {
         results[i + a.length / 2] = b[i];
      } 
      for (int i = a.length / 2; i < a.length; i++) {
         results[i + b.length] = a[i];
      }
      System.out.println(Arrays.toString(results));
      return results;
   }
}