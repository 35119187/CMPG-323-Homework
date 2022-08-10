
/**
 * Write a description of class FileClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileClass
{
    private Contractable [] arrContracts = new Contractable[50];   
    private int count = 0;
     
    public void ReadFromFile(String fileName)
   {
    try
        {
            Scanner sc = new Scanner(new FileReader(fileName));

            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String [] info = line.split("#");

                String name = info[0];
                String registration = info[1];
                String date = info[2];

                if (info.length > 4)
                {
                    int hours = Integer.parseInt(info[3]);
                    String driver = info[4];
                    double rate = Double.parseDouble(info[5]);
                    arrContracts[count] = new ShortTerm(name, registration, date, hours, driver, rate);   
                }
                else
                {
                    int days = Integer.parseInt(info[3]);
                    arrContracts[count] = new LongTerm(name, registration, date, days);
                 }
                count++;
            }
            sc.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "File does not exist");
        }
    }
    
    public int getCount()
    {
        return count;
    }
   
    public Contractable [] getArray()
    {
        return arrContracts;
    }
       
}
