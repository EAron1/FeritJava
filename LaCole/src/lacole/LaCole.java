/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole;

import java.util.*;

/**
 *
 * @author Aron
 */
public class LaCole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int broj = 69;
        int unosBroj = 0;
        int brojPog = 1;
        
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Unesi broj");
            unosBroj = input.nextInt();
            if(unosBroj == broj)
            {
                System.out.println("Tocno");
                break;
            }
            else if(unosBroj < broj)
            {
                System.out.println("Veci je");
            }
            else
            {
                System.out.println("Manji je");
            }
            brojPog++;
        }
        System.out.println("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je " + brojPog + " pokusaja.");
        
    }
    
}
