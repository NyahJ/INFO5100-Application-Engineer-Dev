package Q1;

import java.time.Instant;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;
import java.util.LinkedList;

public class Atm {
	int availableAmountInMachine;
	int transactionFee; 
	HashMap<User, Data> userData;
	User loginUser;
	
	
	public Atm(int availableAmountInMachine, 
			int transactionFee) {
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
		this.userData = new HashMap<>();
		this.loginUser = null;
	}
	
	public boolean isCurrentUser(User user) {
		if (userData.containsKey(user)) {
			return true;
		}
		return false;
	}
	
	public User createUser(String name,
			String address,
			int age,
			int phoneNumber) {
		long bankAccountNumber = Instant.now().getEpochSecond(); 
		String password = UUID.randomUUID().toString();
		User user = new User(name, address, age, phoneNumber, bankAccountNumber);
		Data data = new Data(password);
		userData.put(user, data);
		return user;
	}
	
	public boolean isLoginSuccessful(User user, String password) {
		if (!isCurrentUser(user)) {
			return false;
		}
		
		String correctPassword = userData.get(user).password;
		loginUser = user;
		return password.equals(correctPassword);
	}
	
	public boolean isUserValidated(User user, String name, int age, int phoneNumber) {
		if (!isCurrentUser(user)) {
			return false;
		}
		return user.name.equals(name) && user.age == age && user.phoneNumber == phoneNumber;
	}
	
	public void resetPassword(User user, String name, int age, int phoneNumber) {
		if (!isUserValidated(user, name, age, phoneNumber)) {
			return;
		}
		String password = UUID.randomUUID().toString();
		userData.get(user).password = password;
	}
	
	public int getAvailableBalance(User user) {
		if (user != loginUser) {
			return -1;
		}
		return userData.get(user).availableBalance;
	}
	
	public void withDrawal(User user, int value) {
		if (user != loginUser) {
			return;
		}
		if (value > userData.get(user).availableBalance) {
			return;
		}
		userData.get(user).availableBalance -= value + transactionFee;
		updateTransactions(userData.get(user), -value);
		availableAmountInMachine -= value - transactionFee;
	}
	
	public void deposit(User user, int value) {
		if (user != loginUser) {
			return;
		}
		userData.get(user).availableBalance += value - transactionFee;
		updateTransactions(userData.get(user), value);
		availableAmountInMachine += value;
	}
	
	public void showRecentTransactions(User user) {
		if (user != loginUser) {
			return;
		}
		Queue<Integer> recentTransactions = userData.get(user).recentTransactions;
		for (int transaction : recentTransactions) {
			System.out.println(transaction + " ");
		}
	}
	
	public void changePassword(User user, String password) {
		if (user != loginUser) {
			return;
		}
		userData.get(user).password = password;
	}
	
	public void exit(User user) {
		if (user != loginUser) {
			return;
		}
		loginUser = null;
	}
	
	
	
	private void updateTransactions(Data data, int value) {
		data.updateTransactions(value);
	}
}


	class Data {
		String password;
		int availableBalance;
		Queue<Integer> recentTransactions;
		
		public Data(String password) {
			this.password = password;
			this.availableBalance = 0;
			recentTransactions = new LinkedList<>();
		}
		
		public void updateTransactions(int value) {
			recentTransactions.offer(value);
			if (recentTransactions.size() > 10) {
				recentTransactions.poll();
			}
		}
	}
	
	