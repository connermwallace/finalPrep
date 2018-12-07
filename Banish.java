import java.util.*;

public class Banish {
   public static void main(String[] args) {  
      int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
      int[] a2 = {42, 2222, 9};
      banish(a1, a2);
      System.out.println(Arrays.toString(a1));
   } 
   
   public static void banish(int[] a1, int[] a2) {
      for (int i = 0; i < a1.length; i++) {
         boolean found = false;
         for (int j = 0; j < a2.length; j++) {
            if (a1[i] == a2[j]) {
               found = true;
            }
         }
         if (found) {                                 // Only shift once per # found
            for (int k = i; k < a1.length - 1; k++) {
                  a1[k] = a1[k+1];
            }
            a1[a1.length - 1] = 0;
            i--;
         }
      }
   }
}