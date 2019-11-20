/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi6.zadatak2;

/**
 *
 * @author Aron
 */
public abstract class Zaposlenik 
{
    private String ID, ime, prezime;
    
    String GetID() { return ID; }
    String GetIme() { return ime; }
    String GetPrezime() { return prezime; }
    
    void SetID(String newValue) { ID = newValue; }
    void SetIme(String newValue) { ime = newValue; }
    void SetPrezime(String newValue) { prezime = newValue; }
    
    public void PredstaviSe()
    {
        System.out.println("ID: " + ID + ", Ime: " + ime + ", Prezime: " + prezime);
    }
    
    public void Radi()
    {
        
    }
    
}
