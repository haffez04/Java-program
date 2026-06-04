import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        System.out.print("Deposit: ");
        balance += sc.nextDouble();

        System.out.print("Withdraw: ");
        double amt = sc.nextDouble();

        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");

        System.out.println("Balance = " + balance);

        sc.close();
    }
}