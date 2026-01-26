package p02_orientacao_objeto.a28_exercicio_resolvido.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.holder = holder;
        this.number = number;
        this.balance = 0.0;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account " + number +
                "\nHolder: " + holder +
                "\nBalance: " + String.format("%.2f",balance) +
                "\n";
    }
}
