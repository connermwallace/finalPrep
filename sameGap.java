/*
   Write a static method called sameGap that takes an array of integers as a parameter and that 
   returns whether or not the gap between successive values in the array is always the same. The 
   gap between successive values is defined to be the absolute value of the difference between the 
   two values. For example, consider the following sequence:
*/
public class sameGap {
   public static void main(String[] args) {
   int[] arr = {1, 4, 7, 10, 13, 10, 13, 10, 7, 4};	
   
      System.out.println(sameGap(arr));
   }
   
   public static boolean sameGap(int[] arr) {
      if (arr.length < 2) {
         return true;
      } 
      int gap = Math.abs(arr[1] - arr[0]);
      
      for (int i = 2; i < arr.length; i++) {
         if (Math.abs(arr[i] - arr[i - 1]) != gap) {
            return false;
         }
      }
      return true;
   }
}
      