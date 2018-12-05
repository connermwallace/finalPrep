import java.util.*;

public class ZeroOut {

   public static void main(String[] args) {
      int[] a1 = {1,2,3,4,5,5,6,7,8};
      int[] a2 = {5,5};
      zeroOut(a1, a2);
      System.out.println(Arrays.toString(a1));
   }
   
   public static void zeroOut(int[] a1, int[] a2) {
      for (int i = 0; i < a1.length - a2.length; i++) {
         int count = 0;
         for (int j = 0; j < a2.length; j++) {
            if (a2[j] == a1[i+j]) {
               count++;
            }
         }
         if (count == a2.length) {
            for (int j = 0; j < a2.length; j++) {
               a1[j + i] = 0;
            }
         }
      }
   }
}
