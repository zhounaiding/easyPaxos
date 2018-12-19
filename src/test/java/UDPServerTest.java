import cool.naiding.easyPaxos.network.Server;
import cool.naiding.easyPaxos.network.ServerUDPImpl;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPServerTest {
    public static void main(String[] args) {
        Server server = new ServerUDPImpl(33333);
        while (true) {
            byte[] msg = server.receive();
            System.out.println(data(msg).toString());
        }
    }

    // A utility method to convert the byte array
    // data into a string representation.
    public static StringBuilder data(byte[] a)
    {
        if (a == null)
            return null;
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0)
        {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}
