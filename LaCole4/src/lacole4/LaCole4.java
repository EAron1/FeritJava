/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole4;

/**
 *
 * @author Aron
 */
public class LaCole4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TestAutomobila autoUno = new TestAutomobila(7.5f, 250.5f);
        TestAutomobila autoDuo = new TestAutomobila(5.5f, 120.9f);
        
        UsporedbaPotrosnje us = new UsporedbaPotrosnje();
        us.usporedi(autoUno, autoDuo);
        
    }
    
}

public class TestAutomobila 
{
    private String naziv;
    private float potrosnjaGoriva;
    private float prijedeniPut;

    
    TestAutomobila(float gorivo, float put) // konstruktor to je tamo kada je new TestAutomobila(...)
    {
        potrosnjaGoriva = gorivo;
        prijedeniPut = put;
    }
    
    public float getPotrosnja()
    {
        return potrosnjaGoriva;
    }
    
    public float getPut()
    {
        return prijedeniPut;
    }
    
}

public class UsporedbaPotrosnje 
{
    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2)
    {
        float potrosnjaPrvog = auto1.getPut() / auto1.getPotrosnja();
        float potrosnjaDrugog =  auto2.getPut() / auto2.getPotrosnja();
        
        System.out.println("Auto 1: " + potrosnjaPrvog + ", auto 2: " + potrosnjaDrugog);
        if(potrosnjaPrvog < potrosnjaDrugog)
        {
            System.out.println("Drugi je stedljivij!");
        }
        else if(potrosnjaPrvog > potrosnjaDrugog)
        {
            System.out.println("Prvi je stedljivij!");
        }
        else
        {
            System.out.println("Isto su stedljivi!");
        }
        
    }
    
}