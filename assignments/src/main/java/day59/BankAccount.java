// package day59;

// public class BankAccount {
//         private double bankAccountBalance;
//         private String accountHolderName;

//         //Bank account constructor for parameters
//         public BankAccount(String customerName, double customerBalance){
//             this.bankAccountBalance = customerBalance;
//             this.accountHolderName = customerName;
//     }

//     public double transfer(BankAccount account, double amount){
//         return account.deposit(this.withdrawal(amount));
//     }

//     public double deposit(double customerDeposit){
//         bankAccountBalance += customerDeposit;
//         return customerDeposit;
//     }

//     public double withdrawal(double customerWithdrawal){
//         bankAccountBalance -= customerWithdrawal;
//         return customerWithdrawal;
//     }
    
//     public void accountInfo() {
//         System.out.println("Account Name: " + accountHolderName + '\n' + "Account Balance: $" + bankAccountBalance );
//     }
// }