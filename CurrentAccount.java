package one;
	import java.util.Date;

	public class CurrentAccount extends Account {
	    private double overDraftLimit;

	    public CurrentAccount(int accountNo, Date openedDate, double balance, double overDraftLimit) {
	        //super(accountNo, openedDate, balance);
	        this.overDraftLimit = overDraftLimit;
	    }

	    public double getOverDraftLimit() {
	        return overDraftLimit;
	    }

	    public void setOverDraftLimit(double overDraftLimit) {
	        this.overDraftLimit = overDraftLimit;
	    }

	    public boolean validateOverDraft(double withdrawAmount) {
	        return (getBalance() - withdrawAmount) >= (-overDraftLimit);
	    }
	}
