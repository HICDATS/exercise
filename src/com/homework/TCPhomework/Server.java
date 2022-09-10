package com.homework.TCPhomework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String message;
        while (true){
            message = br.readLine();
            String sendMessge;
            if(message == null){
                break;
            }
            if(message.equals("name")){
                sendMessge = "我是骚甲";
                bw.write(sendMessge);
                bw.newLine();
                bw.flush();
            } else if (message.equals("hobby")) {
                sendMessge = "编写java程序";
                bw.write(sendMessge);
                bw.newLine();
                bw.flush();
            } else if (message.equals("没事了")) {
                sendMessge = "行吧";
                bw.write(sendMessge);
                bw.newLine();
                bw.flush();
                break;
            } else {
                sendMessge = "你在说点啥";
                bw.write(sendMessge);
                bw.newLine();
                bw.flush();
            }
        }

        socket.close();
        serverSocket.close();
        br.close();
        bw.close();
    }
}
