package one;
	public class Bank {
	    private String bankName;
	    private String branchName;
	    private Account[] accounts;
	    private int accountCount;

	    public Bank(String bankName, String branchName) {
	        this.bankName = bankName;
	        this.branchName = branchName;
	        this.accounts = new Account[10];
	        this.accountCount = 0;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getBranchName() {
	        return branchName;
	    }

	    public void setBranchName(String branchName) {
	        this.branchName = branchName;
	    }

	    public boolean addAccount(Account account) {
	        if (accountCount >= 10) {
	            throw new RuntimeException("Maximum account limit reached.");
	        }

	        accounts[accountCount] = account;
	        accountCount++;
	        return true;
	    }

	    public void showAccounts() {
	        for (int i = 0; i < accountCount; i++) {
	            System.out.println("Account " + (i + 1) + ": " + accounts[i]);
	        }
	    }

	    public boolean transaction(char ttype, int accountNo, double amount) {
	        Account account = findAccount(accountNo);
	        if (account == null) {
	            return false;
	        }

	        if (ttype == 'd' || ttype == 'D') {
	            account.setBalance(account.getBalance() + amount);
	            return true;
	        } else if (ttype == 'w' || ttype == 'W') {
	            if (account instanceof SavingsAccount) {
	                SavingsAccount savingsAccount = (SavingsAccount) account;
	                if (!savingsAccount.validateMinimumDeposit(amount)) {
	                    throw new InsufficientBalanceException("Insufficient balance to withdraw.");
	                }
	            } else if (account instanceof CurrentAccount) {
	                CurrentAccount currentAccount = (CurrentAccount) account;
	                if (!currentAccount.validateOverDraft(amount)) {
	                    throw new InsufficientBalanceException("Insufficient balance to withdraw.");
	                }
	            }
	            account.setBalance(account.getBalance() - amount);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    private Account findAccount(int accountNo) {
	        for (int i = 0; i < accountCount; i++) {
	            if (accounts[i].getAccountNo() == accountNo) {
	                return accounts[i];
	            }
	        }
	        return null;
	    }
	}

