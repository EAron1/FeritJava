/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageSisavac;

/**
 *
 * @author Aron
 */
public class Sisavac 
{
    private int dob;
    
    private float tezina;
    protected int starost;
    protected String pasmina;
    
    void Sisavac()
    {
        dob = 0;
        tezina = 0.0f;
    }
    
    public int GetDob(){ return dob; }
    public float GetTezina() { return tezina; }
    
    public void SetDob(int newValue) { dob = newValue; }
    public void SetTezina(float newValue) { tezina = newValue; }
    
}
