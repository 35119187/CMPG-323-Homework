
/**
 * Write a description of class Contract here.
 * 
 * @author () 
 * @version ()
 */
import java.io.Serializable;
public abstract class Contract implements Contractable,Serializable, Comparable<Contract>
{
    private String name;
    private String registration;
    private String date;
    
    public Contract(String name, String registration, String date)
    {
        this.name = name;
        this.registration = registration;
        this.date = date;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRegistration()
    {
        return registration;
    }
    
    public String getDate()
    {
        return date;
    }
    
    @Override
  public int compareTo(Contract contract)
  {
      return(this.registration).compareTo(contract.registration);
  }
    
    public String toString()
    {
        String str = String.format("%-20s%-20s%-20s",name , registration , date);
        return str;
    }

}
