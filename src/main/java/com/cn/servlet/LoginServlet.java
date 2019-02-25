package com.cn.servlet;

import java.io.OutputStream;

import com.cn.http.Request;
import com.cn.http.Response;

public class LoginServlet extends Servlet {
    @Override
    public void doGet(Request request, Response response) {
        this.doPost(request,response);
    }

    @Override
    public void doPost(Request request, Response response)  {
        try {
            OutputStream outputStream = response.outputStream;
            String res = Response.responseHeader+"Hello,welcome to here !";
            outputStream.write(res.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}