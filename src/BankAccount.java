 class BankAccount1 {
     String accountNumber;
     double balance;
     double minimum;

     BankAccount1(String a, double b, double m) {
         accountNumber = a;
         balance = b;
         minimum = m;
     }
 }
class BankAccount{
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1("ACC10045",15000.0,5000.0);
        System.out.println("Account Number: " + b1.accountNumber);
        System.out.println("Current Balance: " + b1.balance);
        System.out.println("Minium Balance: " + b1.minimum);
        System.out.println("Withdraw: " + (b1.balance - b1.minimum));
    }
}




