/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole3;

/**
 *
 * @author Aron
 */
public class LaCole3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Zivotinja[] niz = new Zivotinja[3];
        
        niz[0] = new Lasta();
        niz[1] = new Ptica();
        niz[2] = new Lasta();
        
        for(int i = 0; i < 3; i++)
        {
            niz[i].getIme();
            niz[i].glasajSe();
        }
        
    }
    
}
