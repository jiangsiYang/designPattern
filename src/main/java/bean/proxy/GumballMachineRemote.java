package main.java.bean.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Yang on 2018/2/7.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;

}
