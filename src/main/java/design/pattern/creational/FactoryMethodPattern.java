package design.pattern.creational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

/**
 * Created by avinash on 04/10/20.
 *
 * Factory Method Pattern
     A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to
     instantiate. In other words, subclasses are responsible to create the instance of the class.

     The Factory Method Pattern is also known as Virtual Constructor.

     Advantage of Factory Design Pattern
     Factory Method Pattern allows the sub-classes to choose the type of objects to create.
     It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface
     or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.

     Usage of Factory Design Pattern
     a. When a class doesn't know what sub-classes will be required to create
     b. When a class wants that its sub-classes specify the objects to be created.
     c. When the parent classes choose the creation of objects to its sub-classes.
 */
public class FactoryMethodPattern {

    public static void main(String args[])throws IOException {

        PlanFactory planFactory = new PlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        //call setRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.setRate();
        double totalBill= p.calculateBill(units);

        System.out.print("Total Bill ::"+totalBill);
    }
}

abstract class Plan {
    protected double rate;
    public abstract void setRate();


    public double calculateBill(double units){
        return rate*units;
    }
}

class DomesticPlan extends Plan {

    public void setRate(){
        rate = 5;
    }
}

class CommercialPlan extends Plan {

    public void setRate(){
        rate = 7;
    }
}

class IndustryPlan extends Plan {
    public void setRate(){
        rate = 10;
    }
}

class PlanFactory {

    public Plan getPlan(String planType){
        switch (planType.toLowerCase()){
            case "domestic" :
            case "domesticplan" :
                return new DomesticPlan();

            case "commercial" :
            case "commercialplan" :
                return new CommercialPlan();


            case "industry" :
            case "industryplan" :
                return new IndustryPlan();

            default:
                return null;
        }
    }
}
