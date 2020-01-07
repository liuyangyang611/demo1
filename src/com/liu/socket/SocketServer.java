/**
 * 公司SocketServerasus
 * 文件名2020/1/81:45
 */

package com.liu.socket;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 6000;
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("服务端开始接收");
        //获取套接字对象
        Socket socket = serverSocket.accept();
        //读取套接字内容
        InputStream inputStream = socket.getInputStream();
        //给定一个字节数组
        byte[] bytes = new byte[1024];
        //创建可变字符串
        StringBuffer stringBuffer = new StringBuffer();
        int len = 0;
        if ((len = inputStream.read(bytes))!=-1){
            stringBuffer.append(new String(bytes));
        }
        System.out.println(stringBuffer);
    }
}
