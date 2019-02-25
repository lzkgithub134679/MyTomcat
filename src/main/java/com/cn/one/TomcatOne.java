package com.cn.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  tomcat第一个版本
 * @author Administrator
 * 0.1
 * 实现思路:
 * 一：开放端口,socket实现
 * 二：解析http协议
 * 三：使用线程处理：BIO
 */
public class TomcatOne {
	private static final String heart = " HTTP/1.1 200 \r\n"
            + "Content-Type: text/html\r\n"
            + "\r\n";
	public static void main(String[] args) {
		try {
			//开放端口8080
			ServerSocket serversocket = new ServerSocket(8080);
			System.out.println("服务器已启动");
			//循环处理，接收客户端请求
			while(true){
				Socket socket = serversocket.accept();
				InputStream inputStream = socket.getInputStream();
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf8");
				BufferedReader br=new BufferedReader(inputStreamReader);     
                String line;     
                while((line=br.readLine()) != null){     
                    System.out.println(line);    
                }     
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write((heart+"爱是看得见看").getBytes());
				outputStream.flush();
				outputStream.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
