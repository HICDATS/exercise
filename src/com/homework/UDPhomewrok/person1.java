package com.homework.UDPhomewrok;

import java.net.*;
import java.util.Scanner;

public class person1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9998);

        Scanner input = new Scanner(System.in);
        String question = input.next();
        DatagramPacket packet = new DatagramPacket(question.getBytes(),
                question.getBytes().length, InetAddress.getByName("192.168.56.1"), 8888);

        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        int len = packet.getLength();
        String message = new String(packet.getData(),0,len);
        System.out.println(message);
        socket.close();
    }
}
