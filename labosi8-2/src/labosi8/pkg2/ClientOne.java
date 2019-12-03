/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi8.pkg2;
import java.io.*;
import java.net.*;


/**
 *
 * @author Aron
 */
public class ClientOne 
{
    public ClientOne()
    {
        String host = "127.0.0.1";
        int port = 9999;
        try{
        // kreiramo soket za komunikaciju sa serverom
        Socket klijent = new Socket(host, port);
        System.out.println("Klijent: "+klijent);
        //input i output strimovi
        InputStream in = klijent.getInputStream();
        OutputStream out = klijent.getOutputStream();
        BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        PrintWriter ps = new PrintWriter(new PrintStream(out), true /* autoflush */);
        //poruke koje će nam posluživač vratiti nazad
        String[] eho = {"Poruka 1", "Poruka 2", "BYE"};
        //pošaljemo poruke posluživaču
        for(int i=0;i<eho.length; ++i) ps.println(eho[i]);
        //sad nam tu istu poruku vraća posluzivač
        String linija=null;
        while((linija=bis.readLine()) != null) 
        {
            System.out.println(linija);
        }
        }
        catch (Exception e)
        {
            System.out.println("Greska kod klijenta!");
            e.printStackTrace();
        }
    }
    
}
