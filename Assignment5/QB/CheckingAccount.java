package QB;

public class CheckingAccount extends Account {
	private static int minBalance = 500;
	private static int transactionFee = 5;
	private static int penaltyFee = 10;
	
	public CheckingAccount(String fname, String lname, double cb) {
		super(fname, lname, cb);
	}
	
	@Override
	public double debitTransaction(double debitAmount) {
		super.debitTransaction(debitAmount);
		chargeFee();
		return curBalance;
	}
	
	@Override
	public double creditTransaction(double creditAmount) {
		super.creditTransaction(creditAmount);
		chargeFee();
		curBalance -= transactionFee;
		return curBalance;
	}
	
	private void chargeFee() {
		if (curBalance < minBalance) {
			curBalance -= penaltyFee;
		}
	}
	
	

}
