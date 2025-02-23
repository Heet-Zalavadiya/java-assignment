import java.util.Scanner;

class BankApp {
    int acc_num;
    double balance;
    static String BankName;

    BankApp(int acc_num, double balance, String BankName) {
        this.acc_num = acc_num;
        this.balance = balance;
        BankApp.BankName = BankName;
    }

    void display() {
        System.out.println(acc_num + "\t" + balance + "\t" + BankName);
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of bank accounts: ");
        int n = sc.nextInt();
        BankApp[] b = new BankApp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter enter acc_num :");
            int acc_num = sc.nextInt();
            System.out.println("Enter balance:");
            int balance = sc.nextInt();
            b[i] = new BankApp(acc_num, balance, "heet_DU");
        }
        for (int i = 0; i < n; i++) {
            b[i].display();
        }
        sc.close();
    }

    static {
        System.out.println("Welcome to the Bank");
    }
}
