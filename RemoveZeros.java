import java.util.*;

public class RemoveZeros {
   public static void main(String[] args) {
      int[] arr = {7, 2, 3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19, 14, 0};
      removeZeros(arr);
   }
   
   public static void removeZeros(int[] a) {
      for (int i = 0; i < a.length - 1; i++) {
         for (int j = 0; j < a.length - i - 1;  j++) {
            if ( a[j] == 0 ) {
               int temp = a[j+1];
               a[j + 1] = a[j];
               a[j] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(a));
   }
}
