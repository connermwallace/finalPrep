import java.util.*;

public class Delta {

   public static void main(String[] args) {
      int[] numbers = {3, 8, 15};
      System.out.println(Arrays.toString(delta(numbers)));
      
   }
   
   public static int[] delta(int[] arr) {
      int [] results = new int[arr.length * 2 - 1];
      
      for (int i = 0; i < results.length - 1; i += 2) {
         results[i] = arr[i/2];
         results[i + 1] = arr[i/2 + 1] - arr[i/2];
      }
      results[results.length - 1] = arr[arr.length - 1];
      return results;
   }
}
