/*Bank Account Class: 
Create a BankAccount class with attributes for account holder name, account number, and balance. 
Include methods to deposit, withdraw, and display the current balance. 
Implement checks for insufficient funds during withdrawals.

1) Follow the conepts of OOP
2) Must use the concepts of OOP to implement the above task
3) Maintain code modularity/reusability*/

import java.util.Scanner;
public class BankAccount {
          String name;
          long accountnumber;
          int balance;
        public BankAccount(String n,long AC){
            name=n;
            accountnumber=AC;
            balance=1000;           
         }
        public void deposit(int creamo){
            balance+=creamo;
            System.out.println("after crediting amount: "+creamo +"\n your account balance : "+balance);
         }
        public void withdraw(int widr){
            if (balance>= widr){
                balance-=widr;
                System.out.println("after debiting amount: "+widr+"\n your account balance : "+balance);
            }
            else if (balance<widr) {
                System.out.println("insufficient balance");
            }
        }
}
    class Task_1 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        //BankAccount ob = new BankAccount();
        System.out.println("enter you are Account Number:");
        long ac= sc.nextLong();
        System.out.println("enter your name:");
        String n=sc.next();
        BankAccount ob = new BankAccount(n,ac);
        System.out.println("enter the deposit amount:");
        int dep=sc.nextInt();
        ob.deposit(dep);
        System.out.println("enter the withdrawl amount:");
        int witda=sc.nextInt();
        ob.withdraw(witda);
        


    }

    
} 