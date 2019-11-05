
package labosi4;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aron
 */
public class Labosi4 
{
    private static ObjectOutputStream output;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        // --------------------------------------------- 2. Zadatak ---------------------------------------------
        System.out.println("--------- 2. Zadatak --------- ");
        
        Scanner input = new Scanner(System.in);
        Student studenti[] = new Student[10];
        
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Unesite maticni broj " + (i+1) + ". studenta:");
            studenti[i].maticniBroj = input.nextLine();
            System.out.println("Unesite ime " + (i+1) + ". studenta:");
            studenti[i].ime = input.nextLine();
            System.out.println("Unesite preziime " + (i+1) + ". studenta:");
            studenti[i].prezime = input.nextLine();
            System.out.println("Unesite fakultet " + (i+1) + ". studenta:");
            studenti[i].fakultet = input.nextLine();
            System.out.println("Unesite smjer " + (i+1) + ". studenta:");
            studenti[i].smjer = input.nextLine();
            System.out.println("Unesite godinu " + (i+1) + ". studenta:");
            studenti[i].godina = input.nextInt();
            System.out.println("Unesite prosjek " + (i+1) + ". studenta:");
            studenti[i].prosjecnaOcjena = input.nextFloat();      
            
        }
        openFile();
        for (int i = 0; i < 10; i++) 
        {
            try {
                output.writeObject(studenti[i]);
            } catch (IOException ex) {
                //Logger.getLogger(Labosi4.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        closeFile();
        
        
    }
    
    
    public static void write (Student[]studenti)
    {
        
        String maticniBroj;
        String ime;
        String prezime;
        String fakultet;
        String smjer;
        int godina;
        float prosjecnaOcjena;
        

        
        
        //String filename = "SviStudenti.txt";
       // BufferedWriter outputWriter = null;
        //outputWriter = new BufferedWriter(new FileWriter(filename));
        //for (int i = 0; i < studenti.length; i++) 
        //{
            // Maybe:
         //   outputWriter.write(studenti[i]+"");
            // Or:
        //    outputWriter.write(Integer.toString(x[i]);
       //     outputWriter.write(Integer.toString(x[i]);
        //    outputWriter.newLine();
        //}
        //outputWriter.flush();  
    //        outputWriter.close();  
    }
    
    public static void openFile()
    {
        try {
            output = new ObjectOutputStream(new FileOutputStream( "studenti.ser" ) );
        } catch (IOException ex) {
            Logger.getLogger(Labosi4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //Zatvaranje datoteke
    public static void closeFile()
    {
        if ( output != null )
        try {
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Labosi4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}


