package com.company;
import java.util.*;
import java.lang.*;

class CurrencyExchange {
    double currency;
    double rate;
    public void input() {
        System.out.print("How many euros are you exchanging? ");
        Scanner scan = new Scanner(System.in);
        this.currency = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        this.rate = scan.nextDouble();
    }
    public void output() {
        System.out.println(String.format("%.2f", currency)+ " euros at an exchange rate of " +rate+ " is ");
        double usCurrencyConverted = currency * rate;
        System.out.println(String.format("%.2f", usCurrencyConverted)+ " U.S. Dollars.");
}
public static class Main {

    public static void main(String[] args) {
        CurrencyExchange ca = new CurrencyExchange();
        ca.input();
        ca.output();
    }
}
}