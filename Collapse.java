import java.util.*;

public class Collapse {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[] results = collapse(arr);
      System.out.println(Arrays.toString(results));
   } 
   
   public static int[] collapse(int[] arr) {
      int[] results;
      if (arr.length % 2 ==0) {
         results = new int[arr.length/2];
      } else {
         results = new int[arr.length / 2 + 1];
      }
      for (int i = 0; i < arr.length; i++) {
         if (i == arr.length - 1) {
            results[arr.length / 2] = arr[i];
         } else {
            results[i/2] += arr[i];
            results[i/2] += arr[i+1];
         }
         i += 1;
      }
      return results;
   }
}
         