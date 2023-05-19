/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author Pratik
 */

public class Account {
    private String Number;
    private double Balance;
    private String Name;


    public Account(String Number,double Balance,String Name){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
    }

    public void DepositMoney(double DepositedMoney){
        this.Balance+=DepositedMoney;
        System.out.println("Deposit is Successful, new Balance is " +this.Balance);
    }

    public void WithDrawMoney(double WithdrawalMoney){
        if(this.Balance - WithdrawalMoney < 0){
            System.out.println("WithDraw Unseccessful only " + this.Balance+" is left");
        }else {
            this.Balance-=WithdrawalMoney;
            System.out.println("Withdraw successful, Current Balance is "+this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
