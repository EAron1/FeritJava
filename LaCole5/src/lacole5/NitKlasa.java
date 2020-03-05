/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole5;

/**
 *
 * @author Aron
 */
public class NitKlasa implements Runnable
{
    int[] red;
    NitKlasa(int[] noviRed)
    {
        red = noviRed;
    }
    public void run()
    {
        int max = red[0];
        
        for(int i = 1; i<red.length; i++)
        {
            if(red[i] > max)
            {
                max = red[i];
            }
        }
        
        System.out.println("Nit je gotova max je: " + max);
        
    }
    
}
