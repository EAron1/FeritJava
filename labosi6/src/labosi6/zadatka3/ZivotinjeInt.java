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
public class ZivotinjeInt implements OsnovniInterface
{
    protected String vrsta;
    
    ZivotinjeInt()
    {
        vrsta = "Zivotinja";
    }
    
    public void KreciSe()
    {
        System.out.println("Zivotinja se krece");
    }
}
