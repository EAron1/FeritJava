/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi5;

import PackageMacka.*;
import PackagePas.*;
import PackageSisavac.*;

/**
 *
 * @author Aron
 */
public class Labosi5 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Sisavac sisavac = new Sisavac();
        sisavac.SetDob(5);
        sisavac.SetTezina(25.36f);
        
        Macka mackica = new Macka(6.2f, 3, "ruzna macka");
        
        mackica.SetVrsta("cudna vrsta");
        mackica.Opisivanje();
        
        Pas dog = new Pas(26.2f, 5, "cuko");
        
        dog.SetVrsta("agresivna vrsta");
        dog.Opisivanje();
        
    }
    
}
