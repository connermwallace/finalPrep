public class IsConsecutive {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5,6,7,8,9};
      int[] b = {1,2,3,4,2,5,6,7};
      
      System.out.println(isConsecutive(a));
      System.out.println(isConsecutive(b));
   }
   
   public static boolean isConsecutive(int[] arr) {
      int last = arr[0];
      if (arr.length < 2) {
         return true;
      }
      for ( int i = 1; i < arr.length; i++) {
         if(arr[i] < last) {
            return false;
         }
         last = arr[i];
      }
      return true;

   }
}
