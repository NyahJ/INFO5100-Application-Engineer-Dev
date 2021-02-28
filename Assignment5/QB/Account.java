package QB;

public class Account {
	protected String fname;
	protected String lname;
	protected double curBalance;
	
	public Account(String fname, String lname, double curbalance){
		this.fname = fname;
		this.lname = lname;
		this.curBalance = curbalance;
	}
	
	public String getAcctType() {
		return "Account";
	}
	
	public double debitTransaction(double debitAmount) {
		curBalance -= debitAmount; 
		return curBalance;	
	}
	
	public double creditTransaction(double creditAmount) {
		curBalance += creditAmount;
		return curBalance;
	}
	
	@Override
	public String toString() {
		return "Account name: , Account Type: , Balance$ ";
	}
	
	

}
