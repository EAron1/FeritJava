/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aron
 */
public class LansirnaRampa 
{
    public void Lansiraj(String imeRakete)
    {
        for(int i = 10; i >= 0; i--)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LansirnaRampa.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(imeRakete + ": " + i);
        }
        
    }
    
    synchronized public void LansirajSync(String imeRakete) 
    {
        for(int i = 10; i >= 0; i--)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LansirnaRampa.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(imeRakete + ": " + i);
        }
        
    }
    
}
