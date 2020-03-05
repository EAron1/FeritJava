/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacole5;
import java.util.*;

/**
 *
 * @author Aron
 */
public class LaCole5 
{
    public static void main(String[] args) 
    {
        int M = 0;
        
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Unesi bagro:");
            
            M = input.nextInt();

            if(M > 2 && M < 10)
            {
                break;
            }
        }
        int[][] Matrica = new int[M][M];
        
        for(int i = 0; i< M; i++)
        {
            for(int j = 0; j < M; j++)
            {
                Matrica[i][j] = input.nextInt();
            }
        }
        for(int i= 0; i< M; i++)
        {
            (new Thread(new NitKlasa(Matrica[i]))).start();
        }
    }
}

public class NitKlasa implements Runnable // ako je niti (thredovi) mora biti implements Runnable
{
    int[] red;
    NitKlasa(int[] noviRed) // konstruktor, to se odnosi tamo kad pises new NitKlasa(...)
    {
        red = noviRed;
    }
    public void run() // ovo mora imat i mora se zvat run ako je niti (thredovi)
    {
        int max = red[0];
        
        for(int i = 1; i<red.length; i++)
        {
            if(red[i] > max)
            {
                max = red[i];
            }
        }
        System.out.println("Nit je gotova max je: " + max);   
    }
}