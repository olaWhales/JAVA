public class AccountThirdPractice{
	private String name;
	private double balance;

		
		public AccountThirdPractice( String name , double balance){
			this.name = name;

			//validate the balance is greater than 0.0 if its not,
			//instance variable balance keep its default initial value of 0.0 

			if(balance > 0.0){  //if the balance is valid 
			   this.balance = balance;  //assign it to instance variable balance
			}
		}

			//method that deposit(add) only a valid amount to the balance

		public void deposit(double depositAmount){ 
			if(depositAmount > 0.0)	//if deposit is valid
			balance = balance + depositAmount ; 
		}

			//method that return getBalance
		public double getBalance(){
			return balance ;
		}

			//method that set name
		public void setName(String name){
			this.name = name ;
		}

			// method that get name
		public String getName(){
			return name ; 
		}
			
}
