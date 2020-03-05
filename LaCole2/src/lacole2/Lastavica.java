package lacole2;


import lacole2.Ptica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aron
 */
public class Lastavica extends Ptica
{
    public void glasajSe()
    {
        System.out.println("Lasta se glasa!"); 
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
