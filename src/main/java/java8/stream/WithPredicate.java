package java8.stream;

import java8.stream.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by avinash on 20/09/20.
 */
public class WithPredicate {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");

        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));



        //filter is male w/o predicate fnc
        List<Employee> empMales = employees.stream().filter(e -> e.getGender().equalsIgnoreCase("M")).collect(Collectors.toList());

        System.out.println(empMales);


        //filter is male
        List<Employee> empMaleList = employees.stream().filter(EmployeePredicates.isMale()).collect(Collectors.toList());
        System.out.println(empMaleList);


        //filter age more than 45
        List<Employee> empAgeList = employees.stream().filter(EmployeePredicates.ageGreaterThan(30)).collect(Collectors.toList());
        System.out.println(empAgeList);


        //filter is adult female, check generic in collectors
        List<Employee> empAdultFemale = employees.stream().filter(EmployeePredicates.isAdultFemale()).collect(Collectors.<Employee>toList());
        System.out.println(empAdultFemale);


    }


}

class EmployeePredicates {

    static Predicate<Employee> isMale() {
        return p-> p.getGender().equalsIgnoreCase("M");
    }

    static Predicate<Employee> ageGreaterThan(int age) {
        return p -> p.getAge() > 45;
    }

    static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
}
