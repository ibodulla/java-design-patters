package design.patterns.proxypattern;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Ibodulla Ibodullaev created on 3/18/2020 inside the package - design.patterns.proxypattern
 */
public interface ReportGenerator extends Remote {

    String generateDailyReport() throws RemoteException;
}
