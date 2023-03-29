package BankUser;

/**
 * User
 */
public class User {
    private String userName;
    private int accountNumber;
    private double credit;
    public User(String userName, int accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.credit = 0;
    }
    public String getUserName(){
        return this.userName;
    }
    public int getAccountNumner(){
        return this.accountNumber;
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double value){
        if(this.credit < value){
            System.out.println("Not enough cash!");
        }else{
            System.out.println("Você sacou " + value);
            this.credit -= value;
        }
    }
    public void deposit(double value){
        this.credit += value;
        System.out.println("Seu saldo atual é de " + this.credit);
    }
}