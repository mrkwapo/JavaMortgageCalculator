package com.Dracodess;

import java.text.NumberFormat;

//This class handles displaying mortgage calculation results in the terminal
public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");

        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    //Methods
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        String mortgageFormatted = currency.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
