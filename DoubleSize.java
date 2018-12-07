import java.util.*;

public class DoubleSize {
   public static void main(String[] args) {
      int[] arr = {18, 7, 4, 24, 11};
      doubleSize(arr);
   }
   public static int[] doubleSize(int[] arr) {
      int[] results = new int[arr.length * 2];
      
      for (int i = 0; i < results.length; i += 2) {
         if (arr[i/2] % 2 == 0) {
            results[i] = arr[i/2] / 2;
            results[i + 1] = arr[i/2] / 2;
         } else {
            results[i] = arr[i/2] / 2 + 1;
            results[i + 1] = arr[i/2] / 2;
         }
      }
      System.out.println(Arrays.toString(results));
      return results;
   }
}