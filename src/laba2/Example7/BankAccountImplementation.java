package laba2.Example7;


class BankAccountImplementation implements BankOperations {
    private BankAccount userAccount;

    @Override
    public void openAccount(double initialAmount) {
        this.userAccount = new BankAccount(initialAmount);
        System.out.println("Банковский счет создан с начальным балансом: " + initialAmount);
    }

    @Override
    public void processTransaction(double amount) {
        if (amount >= 0) {
            this.userAccount.addFunds(amount);
        } else {
            this.userAccount.withdrawFunds(Math.abs(amount));
        }
    }

    @Override
    public double checkBalance() {
        return this.userAccount.checkBalance();
    }

}
