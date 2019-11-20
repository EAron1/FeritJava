/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi6;

import labosi6.zadatak2.*;
import labosi6.zadatka3.*;

/**
 *
 * @author Aron
 */
public class Labosi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Zivotinja zivotinja = new Zivotinja();
         Konj konjic = new Konj();
         Riba riba = new Riba();
         Ptica ptica = new Ptica();
         
         zivotinja.KreciSe();
         konjic.KreciSe();
         riba.KreciSe();
         ptica.KreciSe();
         
         Direktor d = new Direktor();
         Tajnica t = new Tajnica();
         Vozac v = new Vozac();
         
         d.radi();
         t.radi();
         v.radi();         
         
    }
    
}
