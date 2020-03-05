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
public class LaCole2 //(Test)
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ptica pero = new Ptica();
        Lastavica lasta = new Lastavica();
        
        pero.setIme("Pero");
        lasta.setIme("Durda");
        
        System.out.println(pero.getIme());
        System.out.println(lasta.getIme());
        
        pero.glasajSe();
        lasta.glasajSe();   
    }
}

public interface Zivotinja 
{
    
    public void setIme(String novoIme);
    
    public String getIme();
    
    public void glasajSe();

}


public class Ptica implements Zivotinja // implements kada je interface
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

public class Lastavica extends Ptica // extends kada je klasa
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
