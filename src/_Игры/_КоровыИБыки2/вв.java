package _Игры._КоровыИБыки2;
import java.util.Scanner;
class Player {
   public static void main (String args[]) {
      Scanner in = new Scanner(System.in);
      boolean sorted = false;
      int temp;
      int[] mount = new int[8];
      // game loop
      while (!sorted) {
         sorted = true;
         for (int i = 0; i < 8; i++) {
            int mountainH = in.nextInt();
            mount[i] = mountainH;
         }
         for (int i = 0; i < mount.length - 1; i++) {
            if (mount[i] > mount[i + 1]) {
               temp = mount[i];
               mount[i] = mount[i + 1];
               mount[i + 1] = temp;
               sorted = false;
            }
         }
      }
      for (int i = 0; i < 8; i++) {
         System.out.println(mount[i]);
      }
   }
}
