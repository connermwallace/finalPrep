import java.util.*;

public class SwapHalves {
   public static void main(String[] args) {
      String[] s = {"one", "two", "three"};        
      swapHalves(s); 
      System.out.println(Arrays.toString(s));
   }
   
   public static void swapHalves(String[] s) {
      String temp = "";
      for (int i = 0; i < s.length/2; i++) {
         temp = s[i];
         s[i] = s[s.length - i - 1];
         s[s.length - 1 - i] = temp;
      }
   }
}       