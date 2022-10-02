package com.ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

class Account {

    Scanner sc = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("'₹'###,##0.00");

        private int customerNumber;
        private int customerPin;
        private double businessBalance = 0;
        private double savingBalance = 0;

        public void setBusinessDeposit(){
            System.out.print("Amount you want to Deposit in Business account: ");
            double amount = sc.nextDouble();
            businessBalance = amount + businessBalance;
            System.out.println("New Business amount balance: "+money.format(businessBalance));
        }
        public void setSavingDeposit(){
        System.out.print("Amount you want to Deposit in Saving account: ");
        double amount = sc.nextDouble();
        savingBalance = amount + savingBalance;
        System.out.println("New Business amount balance: "+money.format(savingBalance));
    }

        public void getBusinessWithdraw( ){
            System.out.print("Amount you want to withdraw from Business account: ");
            double amount = sc.nextDouble();
            if(amount<=businessBalance){
                businessBalance = amount - businessBalance;
                System.out.println("New Business amount balance: "+money.format(businessBalance));
            }
            else {
                System.out.println("insufficient Balance"+"\n");
            }
        }

        public void getSavingWithdraw( ){
        System.out.print("Amount you want to withdraw from Business account: ");
        double amount = sc.nextInt();
        if(amount<=savingBalance){
            savingBalance = amount - savingBalance;
            System.out.println("New Business amount balance: "+money.format(savingBalance));
        }
        else {
            System.out.println("insufficient Balance"+"\n");
        }
    }

        public int getCustomerNumber() {
            return customerNumber;
        }

        public void setCustomerNumber(int customerNumber) {
            this.customerNumber = customerNumber;
        }

        public int getCustomerPin() {
            return customerPin;
        }

        public void setCustomerPin(int customerPin) {
            this.customerPin = customerPin;
        }

        public double getBusinessBalance() {
            return businessBalance;
        }

        public void setBusinessBalance(double businessBalance) {
            this.businessBalance = businessBalance;
        }

        public double getSavingBalance() {
            return savingBalance;
        }

        public void setSavingBalance(double savingBalance) {
            this.savingBalance = savingBalance;
        }
    }

