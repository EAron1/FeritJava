/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi8;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 *
 * @author Aron
 */
public class ServerTwo 
{
    private DatagramSocket socket; 
    public ServerTwo()
    {
        try 
        {
            socket = new DatagramSocket(5000);
        }catch (SocketException ex) 
        {
        Logger.getLogger(ServerTwo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //čekanje na paket, prikaz sadržaja, povrat klijentu
    public void cekanjePaketa()
    {
       while(true)
       {
           try
           {
               byte[] podaci = new byte[100]; //deklaracija paketa
               DatagramPacket prihvatniPaket = new DatagramPacket(podaci, podaci.length);
               //čekanje na primitak paketa
               socket.receive(prihvatniPaket);

               prikaziPoruku("\nPaket primljen:"+
                   "\nHost: "+prihvatniPaket.getAddress()+
                   "\nPort: "+prihvatniPaket.getPort()+
                   "\nDuljina: "+prihvatniPaket.getLength()+
                   "\nSadrži:\n\t"+new String(prihvatniPaket.getData(),
               0,prihvatniPaket.getLength()));
               posaljiPoruku(prihvatniPaket);
           }
           catch(IOException ioException)
           {
               ioException.printStackTrace();
           }
       }
   }
    private void posaljiPoruku(DatagramPacket prihvatniPaket)throws IOException
    {
         //stvaranje paketa za slanje
        DatagramPacket sPaket = new DatagramPacket(prihvatniPaket.getData(),
        prihvatniPaket.getLength(), prihvatniPaket.getAddress(),prihvatniPaket.getPort());
        //slanje paketa
        socket.send(sPaket);

        prikaziPoruku("Paket poslan\n");
     }

    private void prikaziPoruku(final String messageToDisplay)
    {
       System.out.println("Poruka: "+messageToDisplay);
    }
    
    
}
