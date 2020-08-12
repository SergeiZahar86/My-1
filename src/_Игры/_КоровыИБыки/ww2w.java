package _Игры._КоровыИБыки;
import java.util.ArrayList;
import java.util.Random;
class ww2w {
   public static void main (String[] args) {
      System.out.println(str());
      System.out.println(integers());
   }
   static String str () {
      StringBuilder s = new StringBuilder();
      Random random = new Random();
      for (int i = 0; i < 4; i++) {
         s.append(random.nextInt(9));
      }
      return s.toString();
   }
   static ArrayList integers () {
      ArrayList <Integer> integ = new ArrayList <>();
      for (int i = 0; i < 4; i++) {
         int k = new Random().nextInt(9);
         while (integ.contains(k)) {
            k = new Random().nextInt(9);
         }
         integ.add(k);
      }
      return integ;
   }
   static int feedBack (ArrayList arrayList, int myNumber) {
      int k = 0;
      return k;
   }
   static int feedback (ArrayList ans, String guess) {
      Integer integer = 0;
      // feedback - обратная связь
      int bulls = 0, cows = 0;
      for (int i = 0; i < guess.length(); i++) {
         int ind = ans.indexOf(guess.charAt(i));
         if (ind == i)
            bulls++;
         else if (ind >= 0)
            cows++;
      }
      return bulls * 10 + cows;
   }
}



