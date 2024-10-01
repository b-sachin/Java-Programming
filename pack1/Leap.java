package pack1;

public class Leap 
{
    public boolean checkLeap(int y) 
    {
        if (y % 4 == 0) 
        {
            if (y % 100 == 0) 
            {
                return y % 400 == 0; // Leap year if divisible by 400
            }
            return true; // Leap year if divisible by 4 but not by 100
        }
        return false; // Not a leap year
    }
}