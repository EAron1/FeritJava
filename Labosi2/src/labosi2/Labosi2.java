/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi2;

/**
 *
 * @author Aron
 */
public class Labosi2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        // --------- 1. Zadatak --------- 
        System.out.println("--------- 1. Zadatak --------- ");
        
        Zarulja Osram = new Zarulja();
        
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        
        // --------- 2. Zadatak --------- 
        System.out.println("\n--------- 2. Zadatak --------- ");
        
        Zaposlenik Pero = new Zaposlenik(35, 2.5f, 4850.50f);
        Pero.Racunaj();
        Pero.SetStaz(3);
        Pero.Racunaj();
        
        // --------- 3. Zadatak --------- 
        System.out.println("\n--------- 3. Zadatak --------- ");
        
        Test.Testiraj();
        
    }
}

class Zarulja
{
    private boolean Stanje;

    Zarulja()
    {
        Stanje = false;
    }

    public void PritisniPrekidac()
    {
        Stanje = !Stanje;
    }

    public void Provjeri()
    {
        System.out.println(Stanje ? "Svijetli" : "Mrak je");
    }

}

class Zaposlenik
{
    private float staz, placa;
    private int starost;
    Zaposlenik(int starost, float staz, float placa)
    {
        this.starost = starost;
        this.staz = staz;
        this.placa = placa;
    }
    
    float GetStaz() { return staz; }
    float GetPlaca() { return placa; }
    int GetStarost() { return starost; }
    
    void SetStaz(float newValue) { staz = newValue; }
    void SetPlaca(float newValue) { placa = newValue; }
    void SetStarost(int newValue) { starost = newValue; }
    
    void Racunaj()
    {
        float zarada = staz * placa * starost;
        System.out.println("Ukupno je zaradio: " + zarada);
    }
    
    static void Racunaj2(Zaposlenik ZaposRef)
    {
        float zarada = ZaposRef.GetStaz() * ZaposRef.GetPlaca() * ZaposRef.GetStarost();
        System.out.println("Ukupno je zaradio: " + zarada);
    }
    
}


class Test
{
    static void Testiraj()
    {
        Zarulja Led = new Zarulja();
        Led.Provjeri();
        Led.PritisniPrekidac();
        Led.Provjeri();
        Led.PritisniPrekidac();
        Led.Provjeri();
        
        Zaposlenik Ivo = new Zaposlenik(44, 5.2f, 3350.99f);
        Zaposlenik Luka = new Zaposlenik(26, 2.9f, 4650.f);
        
        System.out.println("Ivo:");
        Ivo.Racunaj();
        Zaposlenik.Racunaj2(Ivo);
        
        System.out.println("Luka:");
        Luka.Racunaj();
        Luka.SetPlaca(5000.0f);
        Zaposlenik.Racunaj2(Luka);
        
        
    }
    
    
}
