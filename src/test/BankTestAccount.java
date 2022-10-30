package test;

public class BankTestAccount {
	private String id;
	private String name;
	private int balance;
	 
	//public BankTestAccount() {
		//balance=0;
		
	//}
	public BankTestAccount(String id, String name) {
	this.id=id;
	this.name=name;
	this.balance=0;
	}
	
	public BankTestAccount(String id, String name,int balance) {
		super();
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getID() {
		return id;
	}
    public String getName() {
    	return name;
    }
		
    
    public int getBalance( ) {
    	return balance;
    }
    public void credit(int amount)
    {
    	balance= balance+ amount;
    }
    public void debit(int amount) {
    	if (amount <=balance) {
    			balance=balance-amount;
    			}
    else 
    {
    	System.out.println("Amount exceeded balance");   
    	}
	}
    public void transferTo(BankTestAccount another, int amount)
    {
    	
    	if(amount <=balance) {
    		balance=balance- amount;
    		another.balance=another.balance +amount;
    		
    	}
    	else
    	{
    		System.out.println("Amount exceede balance");
    	}
    }
    public String toString()
    {
    	return  "BankTestAccount[id="  +id +",name=" +name+ ",balance=" + balance +"]";
    }
}



