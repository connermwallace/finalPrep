import java.util.*;

public class DistributeCount {
   public static void main(String[] args) {
      int[] list = {1, 7, 3, 4, 5};
      System.out.println(Arrays.toString(list));
      distributeCount(list, 1);
      System.out.println(Arrays.toString(list));
   }
   
   public static void distributeCount(int[] list, int n) {
      int left = list[n];
      list[n] = 0;
      int count = n + 1;
      while (left != 0) {
         if (count > list.length - 1) {
            count = 0;
         }
         list[count]++;
         left--;
         count++;
      }
   }
}