package _Java8._Глава_30_Регулярные_выражения._15;
import _Java8._Глава_30_Регулярные_выражения._12.AddServerIntf;

import java.rmi.*;
import java.util.Random;
public class AddClient {
    public static void main (String args[]) {
        try {
            // IP-адрес или имя серверной машины/ путь неверен
            String addServerURL = "rmi://Users/serge/IdeaProjects/На ноуте " +
                    "учёба/src/_Java8/_Глава_30_Регулярные_выражения/_14/AddServer";
            AddServerIntf addServerIntf =
                    (AddServerIntf) Naming.lookup(addServerURL);
            Random x = new Random();

            double d1 = x.nextDouble()*100;
            System.out.println("The first number is: " + d1);
            double d2 = x.nextDouble()*100;
            System.out.println("The second number is: " + d2);
            System.out.println("The sum is: " + addServerIntf.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

