/*
   Write a static method called removeDuplicates that 
   takes a sorted array of integer values as a parameter 
   and that constructs and returns an array containing 
   the original sequence of values with the duplicates 
   removed, preserving their relative order. Since the 
   array is guaranteed to be in sorted order, the duplicates 
   will be grouped together. 
*/

import java.util.*;

public class RemoveDuplicates {
   public static void main(String[] args) {
      int[] arr = {1, 1, 1, 3, 6, 7, 7, 10, 10, 10, 10, 18, 21, 24, 24};
      
      System.out.println(Arrays.toString(removeDuplicates(arr)));
   }
   public static int[] removeDuplicates(int[] arr) {
      int count = 0;
      int last = arr[0];
      
      for (int i = 1; i < arr.length; i++) {
         if (last != arr[i] || i == arr.length - 1) {
            count++;
         }
         last = arr[i];
      }
      
      int[] results = new int[count];
      last = arr[0];
      count = 0;
      for (int i = 1; i < arr.length; i++) {
         if (last != arr[i] || i == arr.length - 1) {
            results[count] = last;
            count++;
         }
         last = arr[i];
      }
      return results;
   }
}