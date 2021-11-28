package design.pattern.creational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by avinash on 05/10/20.
 *
 * Abstract Factory Pattern
     Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their
    concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher
    than the Factory Pattern.

     An Abstract Factory Pattern is also known as Kit.

     Advantage of Abstract Factory Pattern
     Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
     It eases the exchanging of object families.
     It promotes consistency among objects.

     Usage of Abstract Factory Pattern
     a. When the system needs to be independent of how its object are created, composed, and represented.
     b. When the family of related objects has to be used together, then this constraint needs to be enforced.
     c. When you want to provide a library of objects that does not show implementations and only reveals interfaces.
     d. When the system needs to be configured with one of a multiple family of objects.
 *
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the name of Bank from where you want to take loan amount: ");
            String bankname =  bufferedReader.readLine();

            System.out.print("\n");
            System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

            String loanName=bufferedReader.readLine();

            AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
            Bank bank = bankFactory.getBank(bankname);

            System.out.print("\n");
            System.out.print("Enter the interest rate for "+bank.getBankName()+ ": ");

            double rate=Double.parseDouble(bufferedReader.readLine());
            System.out.print("\n");
            System.out.print("Enter the loan amount you want to take: ");

            double loanAmount=Double.parseDouble(bufferedReader.readLine());
            System.out.print("\n");
            System.out.print("Enter the number of years to pay your entire loan amount: ");
            int years=Integer.parseInt(bufferedReader.readLine());

            System.out.print("\n");
            System.out.println("you are taking the loan from "+ bank.getBankName());


            AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
            Loan l=loanFactory.getLoan(loanName);
            l.setInterestRate(rate);
            double emi = l.calculateLoanPayment(loanAmount,years);

            System.out.print("EMI stands out as ::"+emi);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        }else if(choice.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }
        return null;
    }
}

class LoanFactory implements AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}

class BankFactory implements AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}

interface AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

class HomeLoan extends Loan{
    public void setInterestRate(double r){
        rate=r;
    }
}

class BussinessLoan extends Loan{
    public void setInterestRate(double r){
        rate=r;
    }

}

class EducationLoan extends Loan{
    public void setInterestRate(double r){
        rate=r;
    }
}

abstract class Loan {
    protected double rate;
    abstract void setInterestRate(double rate);

    public double calculateLoanPayment(double loanAmount, int years){

        int n=years*12;
        rate=rate/1200;
        return ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;
    }
}

interface Bank {
    String getBankName();
}

class HDFC implements Bank {

    private String bankName;

    public HDFC(){
        bankName = "HDFC BANK";
    }

    public String getBankName() {
        return bankName;
    }
}

class SBI implements Bank {

    private String bankName;

    public SBI(){
        bankName = "SBI BANK";
    }

    public String getBankName() {
        return bankName;
    }
}

class ICICI implements Bank {

    private String bankName;

    public ICICI(){
        bankName = "ICICI BANK";
    }

    public String getBankName() {
        return bankName;
    }
}