/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi8.pkg2;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Aron
 */
public class ClientTwo 
{
    private DatagramSocket socket; 
    public ClientTwo()
    {
        try
        {
            socket = new DatagramSocket();
            }
            catch (SocketException socketException){
            socketException.printStackTrace();
            System.exit( 1 );
        }
    }
    
    //čekanje na pakete, prikaz sadržaja
    public void cekanjePaketa()
    {
        try
        {
        byte[] podaci = new byte[ 100 ]; //deklaracija paketa
        DatagramPacket prihvatniPaket = new DatagramPacket(
        podaci, podaci.length );
        //čekanje na paket (blokira dok se paket ne primi)
        socket.receive(prihvatniPaket);
        //prikaz sadržaja paketa
        prikaziPoruku( "\nPacket primljen:" +
        "\nHost: " + prihvatniPaket.getAddress() +
        "\nPort: " + prihvatniPaket.getPort() +
        "\nDuljina: " + prihvatniPaket.getLength() +
        "\nSadrži:\n\t" + new String( prihvatniPaket.getData(),
        0, prihvatniPaket.getLength() ) );
        }
        catch ( IOException exception )
        {
            exception.printStackTrace();
        }
        posaljiPoruku();
    }
    //slanje poruke na poslužitelj
    public void posaljiPoruku()
    {
        //Scanner input_ = new Scanner(system.in);
        Scanner input_ = new Scanner(System.in);
        String unos;
        boolean stanje = true;
        System.out.println("Poruka: ");
        unos = input_.nextLine();
        byte[] podaci = unos.getBytes();
        try 
        {
            //stvaranje paketa za slanje
            DatagramPacket sPaket = new DatagramPacket(podaci, podaci.length,
            InetAddress.getLocalHost(),5000);
            //slanje paketa
            socket.send(sPaket);
            cekanjePaketa();
        } 
        catch (UnknownHostException ex) 
        {
            Logger.getLogger(ClientTwo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(ClientTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //prikaz poruke
    private void prikaziPoruku(final String poruka)
    {
        System.out.println("Poruka: "+poruka);
    } 
    
}
