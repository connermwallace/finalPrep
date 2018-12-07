import java.util.*;

public class ArraySum {
   public static void main(String[] args) {
      double[] a1 = {4.5, 2.8,  3.4, 0.8};
      double[] a2 = {1.4, 8.9, -1.0, 2.3};  
      double[] ax = {2.4, 3.8};            
      double[] ay = {0.2, 9.2, 4.3, 2.8, 1.4};
      System.out.println(Arrays.toString(arraySum(a1, a2)));
      System.out.println(Arrays.toString(arraySum(ax, ay)));
   }     
      
   public static double[] arraySum(double[] a1, double[] a2) {
      double[] results = new double[Math.max(a1.length, a2.length)];
      
      for (int i = 0; i < results.length; i++) {
         if (i < a1.length && i < a2.length) {
            results[i] = a1[i] + a2[i];
         } else if ( i < a1.length) {
            results[i] = a1[i];
         } else {
            results[i] = a2[i];
         }
      }
      return results;
   }
}