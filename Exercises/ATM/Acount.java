
public class Acount {
	private int BankAccount;
	private String Name;
	private String Pass;
	private double Balance;
	private int Credit;
	
	public Acount(int BankAccount,String Pass,String Name,double Balance) {
	this.BankAccount=BankAccount;
	this.Name=Name;
	this.Balance=Balance;
	this.Credit=3000;
	this.Pass=Pass;
	}

	public String getPass() {
		return Pass;
	}
	public int getCredit() {
		return Credit;
	}
	public double getBalance() {
		return Balance;
	}
	public int getBankAccount() {
		return BankAccount;
	}
	public String getName() {
		return Name;
	}
	public void setBankAccount(int bankAccount) {
	BankAccount = bankAccount;
	}
	public void setName(String name) {
	Name = name;
	}
	public String toString() {//toString
		
		return "\n--------------"+this.Name+"--------------"+
				"\nBankAccount: "+this.BankAccount+
				"\nBalance: "+this.Balance+
				"\n-------------------------------------------";
	}
	public void setBalance(double balance) {
		Balance -= balance;
	}
	public void setBalanceAdd(double balance) {
		Balance += balance;
	}
	
}
