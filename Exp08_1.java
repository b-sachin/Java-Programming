class Exp08_1
{
    public static void main(String args[])
    {
        int a,b,ans;
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            ans=a/b;
            System.out.println("The result is = "+ans);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Thats not an array element");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Mistake: wrong data ");
        }
        catch(Exception e)
        {
            System.out.println("Some Issue");
        }
    }   
} 
