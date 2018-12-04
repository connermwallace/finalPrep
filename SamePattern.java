/*
Write a static method called samePattern 
that returns true or false depending upon whether 
two strings have the same pattern of characters. 
More precisely, two strings have the same pattern 
if they are of the same length and if two characters 
in the first string are equal if and only if the 
characters in the corresponding positions in the 
second string are also equal
*/
public class SamePattern {
   public static void main(String[] args) {
      String a = "asasasasas";
      String b = "xyxyxyxyxy";
      System.out.println(samePattern(a, b));
   }
   
   public static boolean samePattern(String a, String b) {
      String ab = "";
      String bc = "";
      int count = 0;
      
      for (int i = 0; i < a.length(); i++) {
         String current = "" + a.charAt(i);
         if (ab.contains(current)) {
            ab += "" + count;
         } else {
            count++;
            ab += "" + count;
         }
      }
      count = 0;
      for (int i = 0; i < b.length(); i++) {
         String current = "" + b.charAt(i);
         if (bc.contains(current)) {
            bc += "" + count;
         } else {
            count++;
            bc += "" + count;
         }
      }
      System.out.println(ab);
      System.out.println(bc);
      return ab.equals(bc);
   }
}
         