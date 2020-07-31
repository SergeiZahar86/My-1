package _Java8._Глава_30_Регулярные_выражения._14;
import _Java8._Глава_30_Регулярные_выражения._13.AddServerImpl;

import java.rmi.Naming;
public class AddServer {
    public static void main (String args[]) {
        try {
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
