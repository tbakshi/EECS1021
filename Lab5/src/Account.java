
public class Account {
	
String name;
	char account;
	double balance;
	
	Account(String name, char account, double balance ) {
		this.name = name; 
		this.account = account;
		this.balance = balance;
		
	}

	Account(String name, char account) {
		this.name = name;
		this.account = account;
		
	}
	
	double getBalance () {
		double balance = 0;
		
		balance = this.balance;
		
		return balance;
	}
	
	String getDescription() {
		String description = "";
		
		if (this.account == 'i') {
			description = ("International account with owner " + this.name +  " has a current balance " + this.balance);
		}
		else if (this.account == 'd' ) {
			description = ("Domestic account with owner " + this.name + " has a current balance " + this.balance);
		}
		
		return description; 
	}

	void setBalance(double d) {
		
			this.balance = this.balance + d;
		
	}
	
	void deposit(double d) {
		
		if (this.account == 'd') {
			this.balance = this.balance + d;
		}
		else if (this.account == 'i' ) {
			this.balance = this.balance + (d-(d*0.1));
		}
		
	}

	void withdraw(double d) {
		
		if (this.account == 'd') {
			this.balance = this.balance  -d;
		}
		else if (this.account == 'i' ) {
			this.balance = this.balance - (d+(d*0.1));
		}
		
	}

	void transferTo(Account acc3, double d) {
		
		if (this.account == 'd') {
			this.balance = this.balance - d;
			if (acc3.account == 'd') {
				acc3.balance = acc3. balance+ d;
			}
			else if (acc3.account == 'i' ) {
				acc3.balance = acc3.balance + (d-(d*0.1));
			}
		}
		else if (this.account == 'i' ) {
			this.balance = this.balance - (d+(d*0.1));
			if (acc3.account == 'd') {
				acc3.balance = acc3.balance + d;
			}
			else if (acc3.account == 'i' ) {
				acc3.balance = acc3.balance + (d-(d*0.1));
			}
		}
	
	}
}
