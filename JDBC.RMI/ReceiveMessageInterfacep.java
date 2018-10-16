import java.rmi.*;

public interface ReceiveMessageInterfacep extends Remote
{
    void receiveMessage(String x) throws RemoteException;
    void ShutDown() throws Exception;
    void Restart() throws Exception;
    void LogOff() throws Exception;
    void Tally() throws Exception;
	
}

