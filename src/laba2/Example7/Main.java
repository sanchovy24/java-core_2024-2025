package laba2.Example7;

public class Main {
    public static void main(String[] args) {
        BankOperations bankOps = new BankAccountImplementation();

        bankOps.openAccount(2000.0);
        bankOps.processTransaction(300.0);
        System.out.println("Текущий баланс: " + bankOps.checkBalance());

        bankOps.processTransaction(-100.0);
        System.out.println("Текущий баланс: " + bankOps.checkBalance());
    }

}
