package com.test;

import java.io.*;
import java.net.*;

import com.neo.util.DigitalTrans;


public class TcpServer {

    public static final int PORT=8888;
    
    public static void main(String[] args) {
    	TcpServer s = new TcpServer();
    	try {
			s.Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void Server() throws IOException {
        ServerSocket ss = new ServerSocket(PORT);
        InetAddress ia = InetAddress.getByName(null);

        System.out.println("Server@"+ia+" start!");

        try{
            while(true){
                Socket s = ss.accept();// listen PORT;
                try{
                    new ServerOne(s);
                } catch (IOException e) {
                    s.close();
                } 
            }
        }finally{
            ss.close();
            System.out.println("Server stop!");
        }
    }
}

class ServerOne extends Thread {
    private Socket s;
    private BufferedReader in;
    private PrintWriter out;
    public ServerOne(Socket s) throws IOException {
        this.s = s;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(new BufferedWriter
                (new OutputStreamWriter(s.getOutputStream())), true);
        start();
    }
    public void run(){
        try {
            while(true) {
                String str = in.readLine();
                if(str == null || str.equals("end")) break;
                System.out.println("Server: receive information："+str);
                out.println("Echo: "+str);
            }
            System.out.println("closing....");
        } catch (IOException e){
        } finally {
            try{
                s.close();
            }catch(IOException e){}
        }
    }
}
