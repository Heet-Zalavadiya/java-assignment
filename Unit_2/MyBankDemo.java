import java.util.Scanner;

class MyBank {
    int accNum;
    String accType;
    double balance;

    MyBank() {
        this.balance = 10000;
    }

    MyBank(int accNum, String accType, double balance) {
        this.accNum = accNum;
        this.accType = accType;
        this.balance = 10000 + balance;
    }

    void creditAmt(double amt) {
        this.balance = this.balance + amt;
        System.out.println("credited amt=" + amt);
    }

    void debitAmt(double amt) {
        /* Add the missing code:debit logic */
        this.balance = this.balance - amt;
        System.out.println("debited amt=" + amt);
    }

    void displayBal() {
        System.out.println("Acc_Num=" + accNum + " bal=" + balance);
    }
}

public class MyBankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBank mb1 = new MyBank();
        MyBank mb2 = new MyBank(2222, "salary", 0);
        MyBank mb3 = new MyBank(3333, "saving", 20000);
        MyBank mb4 = new MyBank(4444, "saving", 40000);
        mb1.displayBal();
        mb2.displayBal();
        mb3.displayBal();
        mb3.creditAmt(400);
        mb3.displayBal();
        /*
         * Add the Missing code here
         * scan value of credit from user
         * call credit method for mb4 here: creditAmt(amount)
         * scan value of debit from user
         * call debit method for mb4 here: debitAmt(amount)
         * call display balance method for mb4 here
         */
        mb4.displayBal();
        System.out.println("Enter value for credit : ");
        double amount = sc.nextDouble();
        mb4.creditAmt(amount);
        System.out.println("Enter value for debit : ");
        amount = sc.nextDouble();
        mb4.debitAmt(amount);
        mb4.displayBal();
        sc.close();

    }
}
