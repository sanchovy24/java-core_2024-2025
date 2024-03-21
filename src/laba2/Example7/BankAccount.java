package laba2.Example7;

public class BankAccount {
    private double accountBalance;

    public BankAccount(double initialAmount) {
        this.accountBalance = initialAmount;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println("Средства успешно добавлены: " + amount);
        } else {
            System.out.println("Недопустимая сумма средств.");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount > 0 && amount <= this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println("Успешное снятие: " + amount);
        } else {
            System.out.println("Недопустимая сумма для снятия или недостаточно средств.");
        }
    }

    public double checkBalance() {
        return this.accountBalance;
    }
}
