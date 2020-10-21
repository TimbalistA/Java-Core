package oop.savingAccounts;

import static java.lang.String.format;

public class SavingAccount {

    private static float annualInterestRate;

    private double savingBalance;

    public SavingAccount(final double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest() {
        final double monthlyInterest = (savingBalance * annualInterestRate) / 12;
        addMonthlyInterestToSavingBalance(monthlyInterest);
    }

    private void addMonthlyInterestToSavingBalance(final double monthlyInterest) {
        savingBalance += monthlyInterest;
    }

    @Override
    public String toString() {
        return format("{savingBalance = %.2f}", savingBalance);
    }

    public static void modifyInterestRate(final float annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

}
