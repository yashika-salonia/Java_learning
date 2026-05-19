import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) {
        try{
            DatagramSocket ds=new DatagramSocket(1234); // create a socket to receive data

            byte[] messagebox=new byte[1024]; //2^10=1024 ~= 1000 byte ~= 1KB , 2^20~= 1MB , 2^30~= 1GB

            System.out.println("Waiing for mesaage from server");
            while(true){
                DatagramPacket dp=new DatagramPacket(messagebox, messagebox.length); // create a datagram packet to receive data
                ds.receive(dp); // receive data from the socket

                String msg=new String(dp.getData(), 0, dp.getLength()); // convert the byte array to string
                System.out.println("Message from server: "+msg);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
