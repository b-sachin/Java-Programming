import java.util.*;
class Bank
{
    Scanner sc = new Scanner(System.in);

    int acc_no;
    float bal;
    String name;

    void openAcc(int a)
    {
        acc_no = a;
        System.out.println("Enter your Name: ");
        name = sc.next();

        System.out.println("Enter initial Balance: ");
        bal = sc.nextInt();
    }

    void deposit()
    {
        System.out.println("Enter Amount to be Deposited: ");
        float dip = sc.nextFloat();
        bal = bal + dip;
    }

    void withdraw()
    {
        System.out.println("Enter amount to be withdrawn: ");
                    float with = sc.nextFloat();
                    if(bal<with)
                    {
                        System.out.println("Insufficiant Balance");
                    }
                    else
                    {
                        bal = bal - with;
                    }
    }

    void display()
    {
        System.out.println("**** Account Information ****");
        System.out.println("Account Number: "+acc_no);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+bal);
    }
}

class Exp02_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Bank b[] = new Bank[10];
        int acno=0;
        while(true)
        {
            System.out.println("\n\n\n1. Open Account \n2.Deposit \n3. withdraw \n4.Display \n5.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    acno++;
                    b[acno] = new Bank();
                    b[acno].openAcc(acno);
                    
                    break;

                case 2:
                    b[acno].deposit();
                    break;

                case 3:
                    b[acno].withdraw();
                    break;

                case 4:
                    System.out.println("Press 1 to Enter Account Number \n Press 0 to Continue");
                    int flag = sc.nextInt();
                    if (flag==0)
                    {
                        b[acno].display();

                    }
                    else
                    {
                        System.out.println("Enter Account Number: ");
                        int temp_acno = sc.nextInt();
                        if (temp_acno<=acno)
                        {
                            b[temp_acno].display();
                        }
                        else
                        {
                            System.out.println("Account Number not Exist");
                        }
                        
                    }
                    break;


                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}