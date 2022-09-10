package com.homework.TCPhomework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br   = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message;
        String reply;
        while(!(message = input.next()).equals("没事了")){
            bw.write(message);
            bw.newLine();
            bw.flush();
            reply = br. readLine();
            System.out.println(reply);
        }

        socket.close();
        bw.close();
    }
}
