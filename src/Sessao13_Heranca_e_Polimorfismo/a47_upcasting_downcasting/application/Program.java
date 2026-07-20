package Sessao13_Heranca_e_Polimorfismo.a47_upcasting_downcasting.application;

import Sessao13_Heranca_e_Polimorfismo.a47_upcasting_downcasting.entities.Account;
import Sessao13_Heranca_e_Polimorfismo.a47_upcasting_downcasting.entities.BusinessAccount;
import Sessao13_Heranca_e_Polimorfismo.a47_upcasting_downcasting.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"James", 0.0,1200.0);
        Account acc3 = new SavingsAccount(1004,"Ana", 1000.0, 0.05);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(120.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



    }
}
