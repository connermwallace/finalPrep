public class Count {
   public static void main(String[] args) {
   String b = "Mississippi";
   String a = "i";
      System.out.println(count(a, b));
   } 
   public static int count(String a, String b) {
      int count = 0; 
      a = a.toLowerCase();
      b = b.toLowerCase();
      
      for (int i = 0; i <= b.length() - a.length(); i++) {
         int test = 0;
         for (int j = 0; j < a.length(); j++) {
            if (b.charAt(i+j) == a.charAt(j)) {
               test++;
            }
         }
         if (test == a.length()) {
            count++;
         }
      }
      return count;
   }
}