package model.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;


    public Account(Double balance, Double withDrawLimit, Integer number, String holder) {
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
        this.number = number;
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;

    }
    public String validateWithdraw(double amount) {

        if (amount > getWithDrawLimit()) {
            return "Erro de saque: A quantia excede o limite de saque";
        }
        if (amount > getBalance()) {
            return "Erro de saque: Saldo insuficiente";
        }
        return  null;
    }
}
