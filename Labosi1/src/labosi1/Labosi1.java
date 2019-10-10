/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi1;
import java.util.Scanner;

/**
 *
 * @author Aron
 */
public class Labosi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // -------- Zadatak 1. -------- 
        System.out.println("Zadatak 1.");
        System.out.println("   J    a    v     v   a");
        System.out.println("   J   a a    v   v   a a");
        System.out.println("J  J  aaaaa    v v   aaaaa");
        System.out.println(" JJ  a     a    v   a     a");
        
        // -------- Zadatak 2. -------- 
        System.out.println("\nZadatak 2.");
        System.out.println("Hello");
        System.out.println("Aron Gaspic");
        
        // -------- Zadatak 3. -------- 
        System.out.println("\nZadatak 3.");
        int a = 74, b = 36;
        System.out.println(a + " + " + b);
        System.out.println(a + b);
        
        // -------- Zadatak 4. -------- 
        System.out.println("\nZadatak 4.");
        int a1 = 50, b1 = 3;
        System.out.println(a1 + "/" + b1);
        System.out.println(a1 / b1);
        
        // -------- Zadatak 5. -------- 
        System.out.println("\nZadatak 5.");
        int x = 0, y = 0;
        System.out.print("Unesi prvi broj: ");
        Scanner input = new Scanner(System.in);
        try
        {
            
        }catch(Exception e)
        {
            
        }
        x = input.nextInt();
        System.out.print("Unesi drugi broj: ");
        y = input.nextInt();
        System.out.println(x + " x " + y + " = " + x*y);
                      
        // -------- Zadatak 6. -------- 
        System.out.println("\nZadatak 6.");
        int x1 = 0, y1 = 0;
        System.out.print("Input first number: ");
        x1 = input.nextInt();
        System.out.print("Input second number: ");
        y1 = input.nextInt();
        System.out.println(x1 + " + " + y1 + " = " + (x1+y1));
        System.out.println(x1 + " - " + y1 + " = " + (x1-y1));
        System.out.println(x1 + " x " + y1 + " = " + x1*y1);
        System.out.println(x1 + " / " + y1 + " = " + x1/y1);
        System.out.println(x1 + " mod " + y1 + " = " + x1%y1);
        
        
    }
    
}
