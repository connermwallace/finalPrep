public class IndexOf {
   public static void main(String[] args) {
      int[] list1 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
      int[] list2 = {1, 3, 6};
      System.out.println(indexOf(list1, list2));
   
   }
   
   public static int indexOf(int[] list1, int[] list2) {
      for (int i = 0; i < list1.length - list2.length; i++) {
         int count = 0;
         for (int j = 0; j < list2.length; j++) {
            if (list1[i + j] == list2[j]) {
               count++;
            }
         }
         if (count == list2.length) {
            return i;
         }
      }
      return -1;
   }
}