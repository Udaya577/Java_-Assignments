package one;
import java.util.Date;

	public class Account {
	    private String accountNo;
	    private Date openedDate;
	    private double balance;

	    public Account(String accountNo, Date openedDate, double balance) {
	        this.accountNo = accountNo;
	        this.openedDate = openedDate;
	        this.balance = balance;
	    }

	    // Getters
	    public String getAccountNo() {
	        return accountNo;
	    }

	    public Date getOpenedDate() {
	        return openedDate;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    // Setters
	    public void setAccountNo(String accountNo) {
	        this.accountNo = accountNo;
	    }

	    public void setOpenedDate(Date openedDate) {
	        this.openedDate = openedDate;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	}
