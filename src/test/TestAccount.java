package test;

public class TestAccount {
	public static void main(String[] args) {
	      
	      BankTestAccount a1 = new BankTestAccount("A101", "Tayyaba");
	      System.out.println(a1);  
	      BankTestAccount a2 = new BankTestAccount("A102", "Sarah",100); 
	      System.out.println(a2);

	      
	      System.out.println("ID: " + a2.getID());
	      System.out.println("Name: " + a2.getName());
	      System.out.println("Balance: " + a2.getBalance());

	      
	      a1.credit(70);
	      System.out.println(a1);
	      a1.debit(50);
	      System.out.println(a1);
	      

	      
	      a2.transferTo(a1, 60);  
	      System.out.println(a1);
	      System.out.println(a2);
	   
}

}



