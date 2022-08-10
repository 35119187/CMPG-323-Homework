
/**
 * Write a description of class LongTerm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongTerm extends Contract
{
    private int days;

    public LongTerm(String name, String registration, String date, int days)
    {
        super(name, registration, date);
        this.days = days;
    }

    public double calcAmount()
    {
        double fullAmount = 0;
        if (days < 10)
        {
            fullAmount = days * 950;
        }
        else if ((days >= 10) && (days <=20))
        {
            fullAmount = days * 800;
        }
        else if (days > 20)
        {
            fullAmount = days * 550;
        }
        return fullAmount;
    }
    
    public double calcDeposit()
    {
      double deposit = calcAmount() * 0.1;
      return deposit;
    }
    
    public String toString()
    {
        String str = String.format("%sR %-15.2fR %-10.2f", super.toString(), calcDeposit(), calcAmount());
        return str;
    }
}
