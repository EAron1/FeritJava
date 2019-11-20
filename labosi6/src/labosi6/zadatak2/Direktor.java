/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi6.zadatak2;

import java.lang.*;

/**
 *
 * @author Aron
 */
public class Direktor extends Zaposlenik
{
    public void radi()
    {
        System.out.println("Odlucujem");
    }
    
    public void PredstaviSe()
    {
        super.PredstaviSe();
        //System.out.println(Class.getClass().getSimpleName());
        System.out.println("ClassDirektor");
    }
    
}
