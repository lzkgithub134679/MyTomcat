package com.cn.tomcat;

import java.io.OutputStream;
import java.net.Socket;

import com.cn.http.Request;
import com.cn.http.Response;
import com.cn.servlet.Servlet;

public class SocketProcess extends Thread{

    protected Socket socket;

    public SocketProcess(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Request request = new Request(socket.getInputStream());
            Response response = new Response(socket.getOutputStream());

            Servlet servlet = Tomcat.servletMapping.get(request.getUrl());

            if (servlet != null) {
               servlet.service(request,response);
            }else{
                String res = Response.responseHeader+"Hello World";
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(res.getBytes());
                outputStream.flush();
                outputStream.close();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}