import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.net.UnknownHostException;
import java.net.Socket;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class client {

    public static void usage()
    {
        System.out.println("USAGE:  java client [EMULATOR_NAME] [SEND_TO_EMULATOR] [RECEIVE_FROM_EMULATOR] [FILE_NAME]");
        System.out.println("    EMULATOR_NAME: host address of the emulator");
        System.out.println("    SEND_TO_EMULATOR: UDP port number used by the emulator to receive data from the client");
        System.out.println("    RECEIVE_FROM_EMULATOR: UDP port number used by the client to receive ACKs form the emulator");
        System.out.println("    FILE_NAME: name of the file to be transferred");
    }

    public static void main(String[] args)
        throws NumberFormatException,
               UnknownHostException,
               IOException,
               InterruptedException
    {
        String emulator_name = null;
        String file_name = null;
        int send_to_emulator = 0;
        int receive_from_emulator = 0;

        // parse args
        if (args.length != 4) {
            usage();
            System.exit(-1);
        }
        emulator_name = args[0];
        send_to_emulator = Integer.parseInt(args[1]);
        receive_from_emulator = Integer.parseInt(args[2]);
        file_name = args[3];

        DatagramSocket udp_sock = new DatagramSocket();
        InetAddress ip = InetAddress.getByName(emulator_name);

        // body of protocol

        udp_sock.close();
    }
}
