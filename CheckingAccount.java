class CheckingAccount extends BankAccount {
int fee=15;
public CheckingAccount(String name, double amount){ //constructor method
super(name,amount);
}
public boolean withdraw(double amount){ //withdraw method
double totalAmount = amount+fee;
return super.withdraw(totalAmount);
}
}