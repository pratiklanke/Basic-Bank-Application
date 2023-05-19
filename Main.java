/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

public class Main {
/**
 *
 * @author Pratik
     * @param args
 */

    public static void main(String[] args) {

        Account PratiksAccount = new Account("101",500,"Pratik");

        PratiksAccount.DepositMoney(50);
        PratiksAccount.DepositMoney(150);

        PratiksAccount.WithDrawMoney(100);
        
        Account OmkarsAccount = new Account("102",300,"Omkar");
        OmkarsAccount.DepositMoney(5000);
        OmkarsAccount.WithDrawMoney(200);
        
    
    }
}
