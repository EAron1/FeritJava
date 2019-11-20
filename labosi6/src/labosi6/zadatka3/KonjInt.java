/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi6.zadatka3;

/**
 *
 * @author Aron
 */
public abstract class KonjInt extends ZivotinjeInt implements Radni
{
    public void radi()
    {
        
    }
    
    KonjInt()
    {
        vrsta = "Konj";
    }
    
    public void KreciSe()
    {
        System.out.println("Trcim");
    }
    
}
