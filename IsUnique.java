public class IsUnique {
   public static void main(String[] args) {
      int [] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
      System.out.println(isUnique(list));
   }
   
   public static boolean isUnique(int[] list) {
      for (int i = 0; i < list.length; i++) {
         for (int j = i + 1; j < list.length; j++) {
            if (list[i] == list[j]) {
               return false;
            }
         }
      }
      return true;
   }
}