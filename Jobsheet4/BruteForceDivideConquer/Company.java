package Jobsheet4.BruteForceDivideConquer;

import java.util.Scanner;

public class Company {
    int months;
    double profits[];

    public Company(int months) {
        this.months = months;
        this.profits = new double[months];
    }

    public int getMonths() {
        return months;
    }

    public double[] getProfits() {
        return profits;
    }

    public void setProfit(int index, double profit) {
        profits[index] = profit;
    }

    public double calculateTotalProfit() {
        double total = 0;
        for (double profit : profits) {
            total += profit;
        }
        return total;
    }
}