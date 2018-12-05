/*
Write a static method called splice that takes as parameters an 
array of integers and a "from index" (inclusive) and "to index" 
(exclusive) and that returns a new array containing the result of 
splicing together three segments of the array. The from and to indexes 
specify a sublist. For example, if list stores the following:
*/
import java.util.*;

public class Splice {
   public static void main(String[] args) {
      int[] arr = {7, 5, 8, 5, 9, 7, 2, 3};
      
      System.out.println(Arrays.toString(splice(arr, 2, 4)));
   } 
   
   public static int[] splice(int[] arr, int from, int to) {
      int[] results = new int[arr.length];
      int resultIndex = 0;
      for (int i = to; i < arr.length; i++) {
         results[resultIndex] = arr[i];
         resultIndex++;
      }
      for (int i = from; i < to; i++) {
         results[resultIndex] = arr[i];
         resultIndex++;
      }
      for (int i = 0; i < from; i++) {
         results[resultIndex] = arr[i];
         resultIndex++;
      }
      return results;
   }
}