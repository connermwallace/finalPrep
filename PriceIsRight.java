public class PriceIsRight {
   public static void main(String[] args) {
      int[] a1 = {234, 528, 235, 253, 400}; 
      System.out.println(priceIsRight(a1, 300));
   }
   
   public static int priceIsRight(int[] a1, int price) {
      int minDiff = price;
      int guess = -1;
      for (int i = 0; i < a1.length; i++) {
         int diff = price - a1[i];
         if (diff >= 0 && diff < minDiff) {
            guess = a1[i];
            minDiff = diff;
         }
      }
      return guess;
   }
}
      