/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi7;

/**
 *
 * @author Aron
 */
public class RaketaRunInterface implements Runnable
{
    String ime;
    LansirnaRampa lansirnaRampa;
    
    RaketaRunInterface(String ime, LansirnaRampa lansRampa)
    {
        this.ime = ime;
        lansirnaRampa = lansRampa;
    }
    
    public void run()
    {
        System.out.println("Ime rakete: " + ime + "\nPocetak lansiranja...");
        if(lansirnaRampa == null)
            lansirnaRampa = new LansirnaRampa();
        lansirnaRampa.Lansiraj(ime);
        System.out.println("Raketa naziva " + ime + " je uspjesno lansirana!");
    }
}
