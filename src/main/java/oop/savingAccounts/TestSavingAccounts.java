package oop.savingAccounts;

import java.util.ArrayList;
import java.util.List;

public class TestSavingAccounts {

    public static void monthlyInterestForAllAccounts(List<SavingAccount> savingAccounts) {
        for (int i = 0; i < savingAccounts.size(); i++) {
            savingAccounts.get(i).calculateMonthlyInterest();
            System.out.println("Saver[" + i + "]: " + savingAccounts.get(i));
        }
    }

    public static void main(String[] args) {
        List<SavingAccount> savingAccounts = new ArrayList<>();
        savingAccounts.add(new SavingAccount(2000));
        savingAccounts.add(new SavingAccount(3000));

        SavingAccount.modifyInterestRate(0.04f);
        monthlyInterestForAllAccounts(savingAccounts);

        SavingAccount.modifyInterestRate(0.05f);
        monthlyInterestForAllAccounts(savingAccounts);
    }

}