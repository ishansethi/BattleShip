public class Validation
{
    public Validation()
    {
    
    }
    
    public boolean stringIsBlank(String str)
    {
        if (str.length() == 0)
            return true;
        else
            return false;
    }
    
    public boolean stringLengthWithinRange(String str, int lower, int upper)
    {
        if (str.trim().length() >= lower && str.trim().length() <= upper)
                return false;
            else
                return true;
    }
    
}