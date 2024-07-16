import java.util.*;
class Sample
{
	public static void main(String args[])
	{

		int choice=0;
		int n;
		Scanner sc = new Scanner(System.in);



		while(true)
		{
			System.out.println("##### Menu #####");
			System.out.println("1.Factorial");
			System.out.println("2.Pallendrome");
			System.out.println("3.Prime");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter Number: ");
					n = sc.nextInt();
					int fact = 1;
					if(n<=0)
					{
						System.out.println(fact);
					}
					else
					{
						for(int i=n;i>0;i--)
						{
							fact=fact*i;
						}
						System.out.println(fact);
					}
					break;
				
				case 2:
					System.out.println("Enter Number to be checked: ");		
					n =sc.nextInt();
					int temp=n;
					int sum=0;
					int count=0;
					while(n!=0)
					{
						int d = n%10;
						sum= sum*10 + d;
						n=n/10;
					}
					if(sum==temp)
					{
						System.out.println("Pallendrome");
					}
					else
					{
						System.out.println("not Pallendrome");	
					}	
					break;	

				case 3:
					System.out.println("Enter number to be checked:");
					n = sc.nextInt();
					boolean flag = false;
					for(int i=2; i<=n/2; i++)
					{
						if(n%i==0)
						{
							flag = true;
							break;
						}
					}
					if(flag)
					{
						System.out.println("Not Prime");
					}
					else
					{
						System.out.println("Prime");
					}
					break;	
	
				case 4:
					System.exit(0);

				default:
					System.out.println("Invalid choice");
					break;							
			}
		}
	}
}		