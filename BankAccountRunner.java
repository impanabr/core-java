class BankAccountRunner{

public static void main(String[] amount){
BankAccount.accountType='s';
BankAccount.balance=50000.75;
BankAccount.accountNumber=1234567890L;
BankAccount.active=true;
BankAccount.accountHolder="Anita";

System.out.println("accountType:"+BankAccount.accountType);
System.out.println("balance:"+BankAccount.balance);
System.out.println("accountNumber:"+BankAccount.accountNumber);
System.out.println("active:"+BankAccount.active);
System.out.println("accountHolder:"+BankAccount.accountHolder);
}
}