package _Java8._Глава_30_Регулярные_выражения._13;
import _Java8._Глава_30_Регулярные_выражения._12.AddServerIntf;

import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject
        implements AddServerIntf {
    public AddServerImpl () throws RemoteException {
    }
    public double add (double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}

