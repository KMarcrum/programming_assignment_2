import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.util.Random;
import java.util.Arrays;

public class server {

    public static void usage()
    {
        System.out.println("USAGE: java server [EMULATOR_NAME] [RECEIVE_FROM_EMULATOR] [SEND_TO_EMULATOR] [FILE_NAME]");
        System.out.println("    EMULATOR_NAME: host address of the emulator");
        System.out.println("    RECEIVE_FROM_EMULATOR: UDP port number used by the server to receive data from the emulator");
        System.out.println("    SEND_TO_EMULATOR: UDP port number used by the emulator to receive ACKs from the server");
        System.out.println("    FILE_NAME: name of the file into which the received data is written");
    }

    public static void main(String[] args)
        throws IOException,
               NumberFormatException
    {
        String emulator_name = null;
        String file_name = null;
        int receive_from_emulator = 0;
        int send_to_emulator = 0;

        // parse args
        if (args.length != 4) {
            usage();
            System.exit(-1);
        }
        emulator_name = args[0];
        receive_from_emulator = Integer.parseInt(args[1]);
        send_to_emulator = Integer.parseInt(args[2]);
        file_name = args[3];

        DatagramSocket udp_sock = new DatagramSocket(r_port);

        // body of protocol

        outfile.close();
        udp_sock.close();
    }
}
