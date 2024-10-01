import pack1.Leap;
import java.util.Random;

class Exp07_1
{
    public static void main(String args[])
    {
        int year;
        Random r = new Random();
        year = r.nextInt(1,9999);

        Leap l = new Leap();
        boolean ans = l.checkLeap(year);

        if(ans)
            System.out.println("Leap Year");
        else 
            System.out.println("Not Leap Year");
    }
}