/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole2;

/**
 *
 * @author Aron
 */
public class Ptica implements Zivotinja
{
    public String ime = "";
        
    public void glasajSe()
    {
        System.out.println("Ptica se glasa!");
    }
    
    public void setIme(String novoIme) 
    {
        ime = novoIme;
    }

    public String getIme() 
    {
        return ime;
    }
}
