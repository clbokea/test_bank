public class Customer {
	
   private String name;
	public Account account = new Account();

	public String getName() 
   {
		return this.name;
	}
   public String display()
   {
      // UC #3 Check Balance
      // The account number and name of the customer 
      // together with the balance is displayed
      return this.name + ", " + 
             this.account.getAccountNumber() + ", " + 
             this.account.checkBallance();
   }
}