/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi8;
import java.io.*;
import java.net.*;

/**
 *
 * @author Aron
 */
public class ServerOne 
{
    //ovaj soket čeka klijenta da se spoji ServerSocket echoServer = null;
 String linija;
 BufferedReader is;
 PrintWriter os;
 Socket clientSocket = null;
 public ServerOne()
 {
    ServerSocket echoServer;
    boolean done = false;
    try 
    {
       echoServer = new ServerSocket();
       echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
       System.out.println("Postavljeni posluzitelj: "+ echoServer.toString());
       // kreiramo sada običan Socket i čekamo klijenta da zatraži
       // vezu
       clientSocket = echoServer.accept();
       System.out.println("Server>> Imamo klijenta: "+clientSocket.getInetAddress());
       //otvaramo kanale za komunikaciju
       is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
       os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);
       //čitamo i pišemo podatke nazad klijentu // sve dok on ne pošalje poruku BYE. boolean done = false;
       while (!done && (linija = is.readLine()) != null) 
       {
           os.println("Echo: "+linija.toUpperCase());
           if(linija.trim().equals("BYE")) done=true;
       }
    }
    catch (IOException e) 
    {
        System.out.println(e);
    }
 }
}
