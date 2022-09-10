package com.homework.UDPhomewrok;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class person2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        int len = packet.getLength();
        buf = packet.getData();
        String message = new String(buf,0 ,len);
        if(message.equals("四大民族是那些")){
            packet = new DatagramPacket("四大名著是------".getBytes(),
                    "四大名著是------".getBytes().length, InetAddress.getByName("192.168.56.1"),9998);
            socket.send(packet);
        }
        socket.close();
    }
}
