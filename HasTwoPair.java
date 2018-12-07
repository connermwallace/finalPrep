public class HasTwoPair {
   public static void main(String[] args) {
      int[] arr = {3, 4, 3, 6, 6};
      System.out.println(hasTwoPair(arr));
   }  
   
   public static boolean hasTwoPair(int[] arr) {
      boolean match = true;
      int count = 0;
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] == arr[i]) {
               match = true;
            }
         }
         if (match) {
            count++;
         }
         match = false;
      }
      return count == 2;
   }
}