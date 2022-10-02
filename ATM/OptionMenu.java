package com.ATM;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class OptionMenu extends Account{
    Scanner input = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("'₹'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<>();
    public void getLoin(){
        try{
            data.put(11111,1254);

            System.out.println("Welcome");

            System.out.println("Entry your customer Number");
            setCustomerNumber(input.nextInt());

            System.out.println("Entry your customer pin");
            setCustomerPin(input.nextInt());
        }catch (Exception e){
            System.out.println("Invalid character(s). Only number");
        }
        for (Map.Entry<Integer,Integer> e : data.entrySet()){
            if (e.getKey()==getCustomerNumber()&&e.getValue()==getCustomerPin()){
                getAccountType();
            }
        }
        System.out.println("Invalid Account Number or Pin");

    }
    public void getAccountType(){
        System.out.println("Select the account you want to access");
        System.out.println("Type 1 - Business Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice - ");
        int selection;
        selection = input.nextInt();
        switch (selection){
            case 1 : getBusiness();
                break;
            case 2 : getSaving();
                break;
            case 3 :
                System.out.println("Thank you for using this ATM, Bye.");
                break;
            default :
                System.out.println("Invalid Choice.");
                getAccountType();
        }
    }
    public void getBusiness(){
        System.out.println("Business Account: ");
        System.out.println("Type 1 - View Balance ");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice - ");
        int selection;
        selection = input.nextInt();
        switch (selection){
            case 1 :
                System.out.println("Business Account Balance: "+money.format(getBusinessBalance()));
                getAccountType();
                break;
            case 2 : getBusinessWithdraw();
                getAccountType();
                break;
            case 3 : setBusinessDeposit();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thank you for using this ATM, Bye.");
                break;
            default :
                System.out.println("Invalid Choice.");
                getBusiness();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance ");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.print("Choice - ");
        int selection;
        selection = input.nextInt();
        switch (selection){
            case 1 :System.out.println("Saving Account Balance: "+money.format(getSavingBalance()));
                getAccountType();
                break;
            case 2 : getSavingWithdraw();
                getAccountType();
                break;
            case 3 : setBusinessDeposit();
                getAccountType();
                break;
            case 4 :
                System.out.println("Thank you for using this ATM, Bye.");
                break;
            default :
                System.out.println("Invalid Choice.");
                getSaving();
        }

    }


}