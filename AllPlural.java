public class AllPlural {
   public static void main(String[] args) {
      String[] a1 = {"snails", "DOGS", "Cats"};
      System.out.println(allPlural(a1));
   }
   
   public static boolean allPlural(String[] arr) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].charAt(arr[i].length() - 1) != 's' &&
               arr[i].charAt(arr[i].length() - 1) != 'S') {
            return false;
            }
      }
      return true;
   }
}