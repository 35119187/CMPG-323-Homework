
/**
 * Write a description of class ShortTerm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShortTerm extends Contract
{
    private int hours;
    private String driver;
    private double rate;

    public ShortTerm(String name, String registration, String date, int hours, String driver, double rate)
    {
        super(name, registration, date);
        this.hours = hours;
        this.driver = driver;
        this.rate = rate;
    }

    public String checkHours()
    {
        String message = "";
        if (hours > 24)
            message = "Error! Hours cannot exceed 24!";
        return message;
    }

    public double calcAmount()
    {
        double fullAmount = 0;
        if (hours <= 24)
        {
            if (hours <= 8)
            {
                fullAmount = hours * rate;
            }
            else if (hours > 8)
            {
                fullAmount = (8 * rate) + (((hours - 8) * rate) * 2);
            }
        }
        return fullAmount;
    }
    
    public double calcDeposit()
    {
      double deposit = calcAmount() * 0.05;
      return deposit;
    }
    
    public String toString()
    {
        String str = String.format("%sR %-15.2fR %-10.2f", super.toString(), calcDeposit(), calcAmount() );
        return str;
    }
}
