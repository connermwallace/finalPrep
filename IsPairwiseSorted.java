/*
 Write a static method called isPairwiseSorted that takes an array of integers as a parameter and that
 returns whether or not the array is pairwise sorted. An array is considered to be pairwise sorted if 
 it contains a sequence of pairs where each pair is in sorted (nondecreasing) order. 
*/
public class IsPairwiseSorted {
   public static void main(String[] args) {
   int[] arr = {3};

      System.out.println(isPairWiseSorted(arr));
   }
   
   public static boolean isPairWiseSorted(int[] arr) {
      for (int i = 0; i < arr.length - 1; i += 2) {
         if (arr[i] > arr[i + 1]) {
            return false;
         }
      }
      return true;
   }
}
      