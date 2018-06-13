package driver;
import userdefineexception.InsufficientFundsException;
import util.CheckingAccount;
public class Exception {


	 	 public static void main(String[] args) {
	 		
	 		 CheckingAccount c = new CheckingAccount(101);
	 		 try{
	 		 System.out.println("depoysiting 5000 Rs");
	 		 c.deposite(5000);
	 		 System.out.println("withdraw 1000 Rs");
	 		 c.withdraw(1000);
	 		 System.out.println("withdraw 5000 Rs");
	 		 c.withdraw(5000);
	 		 }catch(InsufficientFundsException e){
	 			 System.out.println("Insufficient balance ,you are short of "+e.getamount());
	 		 }
		

	}

}
