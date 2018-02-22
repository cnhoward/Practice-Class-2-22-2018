import java.util.Scanner;
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount account1 = new SavingsAccount("James", 1025, 14758.36);
SavingsAccount account2 = new SavingsAccount("Tyrone", 4581, 74583.89);
SavingsAccount account3 = new SavingsAccount("Jerry", 8475, 14579.36);

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the amount you would like to withdraw");

double With = scanner.nextDouble();
System.out.println("Enter your username, pin number, and balance");

SavingsAccount CurrentAccount = new SavingsAccount(scanner.next(), scanner.nextInt(), scanner.nextDouble());

System.out.println("The balance after withdraw is" + CurrentAccount.Withdraw(With));

System.out.println("Enter another username, pin number, and balance");

SavingsAccount OverDraftAccount = new SavingsAccount(scanner.next(), scanner.nextInt(), scanner.nextDouble());

System.out.println("Enter a deposit in account 2");

System.out.println("The balance after the deposit in account 2 is " + account2.Deposit(scanner.nextDouble()));


	}

}
