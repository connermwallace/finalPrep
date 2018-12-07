import java.util.*;
public class Positives {
   public static void main(String[] args) {
      int[] array1 = { 1, 2, -3, 4, 5, 6 };
      System.out.println(Arrays.toString(postives(array1)));
   }
   
   public static int[] postives(int[] arr) {
      int count = 0; 
      for ( int i = 0; i < arr.length; i++) {
         if(arr[i] >= 0) {
            count++;
         }
      }
      int[] results = new int[count];
      count = 0; 
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= 0) {
            results[count] = arr[i];
            count++;
         }
      }
      return results;
   }
}