/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagePas;

import PackageSisavac.*;
import java.util.*;

/**
 *
 * @author Aron
 */
public class Pas extends Sisavac
{
    private String vrsta;

    float tezina;
    
    public Pas(float tezina, int starost, String pasmina)
    {
        this.tezina = tezina;
        this.starost = starost;
        this.pasmina = pasmina;
    }
    
    public String GetVrsta() { return vrsta; }
    
    public void SetVrsta(String newValue) { vrsta = newValue; }

    public void Opisivanje()
    {
        System.out.println("Opisivanje: \nTezina: "+ tezina + "\nStarost: " + starost + "\nPasmina: "+ pasmina);
    }
    
}
