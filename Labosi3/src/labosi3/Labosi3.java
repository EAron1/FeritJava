/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Licenca direktno Aronu, kod kosta 250.000,00 USD molim lijepo uplatiti trazeni iznos prije koristenja
 */
package labosi3;
import java.util.*;

/**
 *
 * @author Aron
 */
public class Labosi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // --------------------------------------------- 1. Zadatak ---------------------------------------------
        System.out.println("--------- 1. Zadatak --------- ");
        
        Scanner input = new Scanner(System.in);
        
        int n = UnosVelicineVektora();
        int m = UnosVelicineMatrice();
        int choose = -1;

        do
        {
            System.out.println("Odaberite: \n 1 - Izracun aritmeticke sredine sporedne dijagonale\n 2 - Izracun sume neparnih elemenata prvog retka"
                + "\n 3 - Ispisat sve brojeve na parnim indeksimma vektora v \n 4 - Ponovni unos velicine vektora\n 5 - Ponovni unos velicine matrice"
                    + "\n 0 - za izlaz");
            try
            {
                choose = input.nextInt();
            }
            catch(java.util.InputMismatchException ex)
            {
                input.nextLine();
                System.out.println("Greska!");
                choose = -1;
                continue;
            }
            switch(choose)
            {
                case 0:
                    // get the f.. out
                    break;
                case 1:
                    IzracunAritmetSporedDiagon(m);
                    break;
                case 2:
                    IzracunSumaNeparElPrPsMat(m);
                    break;
                case 3:
                    PrintParniIndeksiVektor(n);
                    break;
                case 4:
                    n = UnosVelicineVektora();
                    break;
                case 5:
                    m = UnosVelicineMatrice();
                    break;
                default:
                    System.out.println("Neispravna opcija!");
                    break;
            }
        }while(choose != 0);
        
        
    }
    
    static int UnosVelicineVektora()
    {
        Scanner input = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Unesite maksimalni broj eleemenata vektora (izmedu 2 i 10)");
            try
            {
                n = input.nextInt();    
            }
            catch(java.util.InputMismatchException ex)
            {
                input.nextLine();
                System.out.println("Greska!");
                continue;
            }
            if(n > 2 && n < 10)
            {
                return n;
            }
            System.out.println("Neispravan unos! Broj mora biti izmedu 2 i 10.");
        }while(true);
    }
    
    static int UnosVelicineMatrice()
    {
        Scanner input = new Scanner(System.in);
        int m;
        do
        {
            System.out.println("Unesite dimenzije kvadratne matrice (MxM) izmedu 1 i 5");
            try
            {
                m = input.nextInt();    
            }
            catch(java.util.InputMismatchException ex)
            {
                input.nextLine();
                System.out.println("Greska!");
                continue;
            }
            if(m > 1 && m < 5)
            {
                return m;
            }
            System.out.println("Neispravan unos! Broj mora biti izmedu 1 i 5.");
        }while(true);
        
    }
    
    static void IzracunAritmetSporedDiagon(int m)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int [][] matrica = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Unesite " + (j+1) + ". cijeli broj u retku " + (i+1) + ":");
                try
                {
                    matrica[i][j] = input.nextInt();
                }
                catch(java.util.InputMismatchException ex)
                {
                    input.nextLine();
                    System.out.println("Greska!");
                    j--;
                    continue;
                }
                if((i + j) == (m -1))
                {
                   sum += matrica[i][j]; 
                }
            }
        }
        System.out.println("Sume sporedne diagonale je: " + sum);
    }
    
    static void IzracunSumaNeparElPrPsMat(int m)
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean flagFound = false;
        int [][] matrica = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Unesite " + (j+1) + ". cijeli broj u retku " + (i+1) + ":");
                try
                {
                    matrica[i][j] = input.nextInt();
                }
                catch(java.util.InputMismatchException ex)
                {
                    input.nextLine();
                    System.out.println("Greska!");
                    j--;
                    continue;
                }
                if((i == 0 || j == 0) && (matrica[i][j] % 2 != 0))
                {
                    flagFound = true;
                   sum += matrica[i][j]; 
                }
            }
        }
        if(flagFound)
        {
            System.out.println("Suma neparnih elemenata prvog retka i stupca matrice iznos: " + sum);
        }
        else
        {
            System.out.println("Nije bilo neparnih elemenata.");
        }
                    
    }
    
    static void PrintParniIndeksiVektor(int n)
    {
        Vector v = new Vector();
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) 
        {
                System.out.println("Unesite " + (i+1) + ". cijeli broj vektora: ");
                try
                {
                    v.add(input.nextInt());
                }
                catch(java.util.InputMismatchException ex)
                {
                    input.nextLine();
                    System.out.println("Greska!");
                    i--;
                    continue;
                }
        }
        System.out.println("Svi brojevi na parnim indeksima vektora su: ");
        for (int i = 0; i < n; i+=2) 
        {
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
    }
    
}
