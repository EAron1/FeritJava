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
public class Labosi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LansirnaRampa rampica1 = new LansirnaRampa();
        LansirnaRampa rampica2 = new LansirnaRampa();
        LansirnaRampa rampica3 = new LansirnaRampa();
        LansirnaRampa rampica4 = new LansirnaRampa();
        
        LansirnaRampa ramp1 = new LansirnaRampa();
        LansirnaRampa ramp2 = new LansirnaRampa();
        LansirnaRampa ramp3 = new LansirnaRampa();
        LansirnaRampa ramp4 = new LansirnaRampa();
        
        // ---------------------- Zadatak 1./3. ---------------------- 

        // nacin za paralelno
        (new Thread(new Raketa("ThrRocket1", rampica1))).start();
        (new Thread(new Raketa("ThrRocket2", rampica1))).start();
        (new Thread(new Raketa("ThrRocket3", rampica1))).start();
        (new Thread(new Raketa("ThrRocket4", rampica1))).start();
        
        // nacin za jednu po jednu
        //Raketa rocket1 = new Raketa("Raketica1", rampica1);
        //Raketa rocket2 = new Raketa("Raketica2", rampica2);
        //Raketa rocket3 = new Raketa("Raketica3", rampica3);
        //Raketa rocket4 = new Raketa("Raketica4", rampica4);
        //rocket1.run();
        //rocket2.run();
        //rocket3.run();
        //rocket4.run();
        
        // ---------------------- Zadatak 2. ---------------------- 
        
        // nacin za jednu po jednu
        //RaketaRunInterface roki1 = new RaketaRunInterface("Roki1", rampica1);
        //RaketaRunInterface roki2 = new RaketaRunInterface("Roki2", rampica2);
        //RaketaRunInterface roki3 = new RaketaRunInterface("Roki3", rampica3);
        //RaketaRunInterface roki4 = new RaketaRunInterface("Roki4", rampica4);
        //roki1.run();
        //roki2.run();
        //roki3.run();
        //roki4.run();
        
        // nacin za paralelno i odjednom...
        (new Thread(new RaketaRunInterface("Roks1", ramp1))).start();
        (new Thread(new RaketaRunInterface("Roks2", ramp2))).start();
        (new Thread(new RaketaRunInterface("Roks3", ramp3))).start();
        (new Thread(new RaketaRunInterface("Roks4", ramp4))).start();
        
        
    }
    
}
