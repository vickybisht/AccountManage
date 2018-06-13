package util;

import userdefineexception.InsufficientFundsException;

public class CheckingAccount {

		private double balance;
		private int number;
		public  CheckingAccount(int number){
			this.number = number;
		}
		public double getbalance(){
			return balance ;
			
		}
		public int getnum(){
			return number;
		}
		public void deposite(double amount){
			this.balance += amount;
			
		}
		public void withdraw(double amount)throws InsufficientFundsException {
			if(amount < balance){
				balance = balance- amount;
				
			}
			else{
				double need = amount - balance;
				throw new InsufficientFundsException(need);
				
			}
				
		}
		
}
