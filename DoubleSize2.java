import java.util.*;

public class DoubleSize2 {
   public static void main(String[] args) {
      int[] list = {18, 7, 4, 24, 11};
      System.out.println(Arrays.toString(doubleSize(list)));
   }
   
   public static int[] doubleSize(int[] list) {
      int[] result = new int[list.length * 2];
      
      for (int i = 0; i < list.length; i++) {
         if (list[i] % 2 != 0) {
            result[i*2] = list[i]/2 + 1;
            result[i*2 + 1] = list[i]/2;
         } else {
            result[i*2] = list[i]/2;
            result[i*2 + 1] = list[i]/2;

         }
      }
      return result;
   }
}