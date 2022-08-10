
/**
 * Write a description of class testContracts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class testContracts
{
    public static void main(String [] args) throws IOException
    {
        FileClass file = new FileClass();
        file.ReadFromFile("Contracts.txt");
        
        Contractable [] arrContracts = new Contractable[50];
        arrContracts = file.getArray();
        int count = file.getCount();
        
        display(arrContracts,count);
        sortData(arrContracts,count);    
        display(arrContracts, count);
        
        arrContracts = Arrays.copyOf(arrContracts, count);
        Arrays.sort(arrContracts);
        display(arrContracts, count);
             
    }

    public static void display(Contractable [] arrContracts, int count)
    {
        System.out.println("Contracts:");
        System.out.printf("%-20s%-20s%-20s%-15s%-10s\n", "Name of Customer", "Registration Nr", "Date", "Deposit", "Amount Payable");
        for (int k = 0; k < count; k++)
        {
            Contractable contract = arrContracts[k];
            System.out.println(contract.toString());
        }
    }
    public static void sortData(Contractable [] arrContracts, int count)
    {
        int min = 0;
        for(int k=0; k < count -1; k++)
        {
            min = k;
            
            for(int j = k + 1; j < count; j++)
            {
                if(arrContracts[min].getDate().compareTo(arrContracts[j].getDate())>0)
                {
                    min = j;    
                }
            }
            if(min !=k)
            {
                Contractable contr = arrContracts[min];
                arrContracts[min] = arrContracts[k];
                arrContracts[k] = contr;
            }
        }
        
    }
    
   
}
