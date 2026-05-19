import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server{
    public static void main(String[] args) {
        try{
            // Datagram = Packet of data(data in format of byte array, length of data, destination ip, destination port)
            // String msg = "Hello";
            // "H"-72
            // "e"- 101
            // "l"-108
            // "l"-108
            // "o"-111

            // byte- primitive datatype (smallest is byte) - call by value - memory m store hota h
            // byte[] data=msg.getBytes(); //[72, 101, 108, 108, 111]

            DatagramSocket ds= new DatagramSocket(); // create a socket to send data
            Scanner sc=new Scanner(System.in);
            
            InetAddress ip=InetAddress.getByName("localhost"); //this is used to get the ip address of the website
            int port=1234; // this is the port number of the server to which we want to send data
            while(true){
                System.out.print("Enter the message to send to the client: ");
                String msg=sc.nextLine();

                byte[] data=msg.getBytes(); // convert the string message to byte array
                DatagramPacket dp=new DatagramPacket(data, data.length, ip, port); // create a datagram packet to send data
                ds.send(dp); // send the datagram packet
                System.out.println("Data has been successfully send!!");
            }
            

        }catch(Exception e){
            System.out.println(e);
        }
    }
}