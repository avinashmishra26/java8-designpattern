package design.pattern.structural;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by avinash on 05/10/20.
 *
 * An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".

     In other words, to provide the interface according to client requirement while using the services of a class with a different interface.

     The Adapter Pattern is also known as Wrapper.

     Usage of Adapter pattern:
     It is used:

     When an object needs to utilize an existing class with an incompatible interface.
     When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
     When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
 */
public class AdapterPattern {


    public static void main(String args[]){
        CreditCard targetInterface=new BankCustomer();
        targetInterface.getBankDetails();
        System.out.print(targetInterface.getCreditCard());

    }
}

class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void getBankDetails() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the Bank name :");
            String bankName = bufferedReader.readLine();

            System.out.print("\n");

            System.out.print("Enter the account holder name :");
            String accHoldername = bufferedReader.readLine();

            System.out.print("\n");


            System.out.print("Enter the account number :");
            long accountNumber = Long.parseLong(bufferedReader.readLine());

            setAccountHolderName(accHoldername);
            setBankName(bankName);
            setAccountNumber(accountNumber);


        }catch (Exception ex){}
    }

    @Override
    public String getCreditCard() {
        long accno=getAccountNumber();
        String accholdername=getAccountHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname+
                "bank is valid and authenticated for issuing the credit card. ");
    }
}

interface CreditCard {
    public void getBankDetails();
    public String getCreditCard();
}

class BankDetails {

    private String bankName;
    private String accountHolderName;
    private long accountNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

}
