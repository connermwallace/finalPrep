public class IsReverse {
   public static void main(String[] args) {
      int[] list1 = {10, 15, 24, 32, 19};
      int[] list2 = {19, 32, 24, 15, 10};
      System.out.println(isReverse(list1, list2));
   }
   
   public static boolean isReverse(int[] a1, int[] a2) {
      if (a1.length != a2.length) {
         return false;
      }
      for (int i = 0; i < a1.length; i++) {
         if (a1[i] != a2[a2.length - 1 - i]) {
            return false;
         }
      }
      return true;
   }
}
