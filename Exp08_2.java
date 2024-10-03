
class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class Exp08_2
{
    public static void main(String args[])
    {
        int a,b,ans;
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            if(a<1 || a>9)
            {
                throw new MyException("'a' should be between 1 and 9");
            }
            ans=a/b;
            System.out.println("The result is = "+ans);
        }        
        catch(MyException e)
        {
            System.out.println("Some error");
            System.out.println(e);  
        }
        finally
        {
            System.out.println("This statement will get executed");
        }
    }   
}
