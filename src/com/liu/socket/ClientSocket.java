/**
 * 公司ClientSocketasus
 * 文件名2020/1/81:52
 */

package com.liu.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 6000;
        Socket socket = new Socket(host,port);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String str = "你好，我是客户端";
        outputStream.write(str.getBytes("UTF-8"));
        System.out.println("客户端发送成功");
        socket.close();
    }
}
