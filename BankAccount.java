package bank;
import java.util.Scanner;

public class BankAccount {
	
private static String account = "123456789";
private static String name ="Pranab Nepal";
private static String email ="pranabnepal@yahoo.com";
private static String phone = "415-415-4154";
static int balance=500;

public static String getAccount() {
	return account;
}

public static String getName() {
	return name;
}

public static String getEmail() {
	return email;
}

public static String getPhone() {
	return phone;
}

public static void addBalance()
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the amount you want to add");
	int fund=input.nextInt();
	if(fund>=0)
	balance=balance+fund;
	else
	System.out.println("Not a valid addition");
}
public static void deductBalance()
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the amount you want to withdraw");
	int fund=input.nextInt();
	if(fund<=balance)
	balance=balance-fund;
	else
	System.out.println("Not a valid withdrawl");
}
public static void printAll()
{
	System.out.println("************************************");
	System.out.println(getName()+"**************************");
	System.out.println(getAccount()+"***********************");
	System.out.println(balance+"****************************");
	System.out.println(getPhone()+"*************************");
	System.out.println(getEmail()+"*************************");
	System.out.println("************************************");
}
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int option=0;
	while(option !=4)
	{
	System.out.println("Welcome to your Bank. \n Please choose from following option: \n"
			+ " 1)Current Status \n 2)Add Funds \n 3)Withdraw Funds \n 4)Exit");
	option = input.nextInt();
	switch(option)
	{
	case(1):
	{
		BankAccount.printAll();
		break;
	}
	case(2):
	{
		BankAccount.addBalance();
		break;
	}
	case(3):
	{
		BankAccount.deductBalance();
		break;
	}
	
	}
	}
}
}