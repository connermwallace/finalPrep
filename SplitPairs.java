import java.util.Arrays;

public class SplitPairs {
   public static void main(String[] args) {
      int[] arr = {3, 8, 4, 9, 7, 2};
      System.out.println(Arrays.toString(splitPairs(arr)));
   }
   public static int[] splitPairs(int[] arr) {
      int[] results = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {
         if (i % 2 == 0) {
            results[i/2] = arr[i];
         } else {
            results[arr.length / 2 + i/2] = arr[i];
         }
      }
      return results;
   }
}
