import java.util.*;

public class Expand {

   public static void main(String[] args) {
   int[] arr = {3, 8, 4, 2, 0, 42, 5, 1};
      System.out.println(Arrays.toString(expand(arr)));
   } 
   
   public static int[] expand(int[] arr) {
      int len = 0;
      for (int i = 0; i < arr.length; i+= 2) {
         len += arr[i];
      }
      int[] results = new int[len];
      int index = 0;
      for (int i = 1; i < arr.length; i += 2) {
         int times = arr[i-1];
         for(int j = 0; j < arr[i-1]; j++) {
            results[j + index] = arr[i];
         }
         index += times;
      }
   return results;
   }
}