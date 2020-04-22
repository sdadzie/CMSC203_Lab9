public class SavingsAccount extends BankAccount{ //savings account
double rate=2.5; //variables declared
int savingsNumber=0;
String accountNumber;
public SavingsAccount(String name, double amt){ //constructor declared
super(name,amt);
this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
}
public void postInterest(){ //interest method
  
}
public String getAccountNumber(){
return null;
}
public SavingsAccount(SavingsAccount acc,double balance){ //copy constructor method
super(acc,balance);
this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
}
}

