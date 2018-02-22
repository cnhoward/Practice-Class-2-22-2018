
public class SavingsAccount {
String Username;
int Pin;
double Balance;


public SavingsAccount(String Username2, int Pin2, double Balance2)
{
	Username = Username2;
	Pin = Pin2;
	Balance = Balance2;
	
}
public double Withdraw( double With){
	double amount = (Balance - With);
	return amount;
}
public double Deposit(double Depo){
	double amount = (Balance + Depo); 
	return amount;
}
}
