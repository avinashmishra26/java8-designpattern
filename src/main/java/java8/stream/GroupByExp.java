package java8.stream;

import java8.stream.model.Employee;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by avinash on 06/10/20.
 */
public class GroupByExp {


    public static void main(String[] args) {
        Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
        Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
        Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");
        Employee e4 = new Employee(4, 26, "M", "Jon", "Lowman");
        Employee e5 = new Employee(5, 19, "F", "Cristine", "Maria");
        Employee e6 = new Employee(6, 15, "M", "David", "Feezor");
        Employee e7 = new Employee(7, 68, "F", "Melissa", "Roy");
        Employee e8 = new Employee(8, 79, "M", "Alex", "Gussin");
        Employee e9 = new Employee(9, 15, "F", "Neetu", "Singh");
        Employee e10 = new Employee(10, 45, "M", "Naveen", "Jain");

        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(Arrays.asList(new Employee[]{e1, e2, e3, e4, e5, e6, e7, e8, e9, e10}));


        //Group by MALE and FEMALE
        Map<String,List<Employee>> genderEmps= employees.stream().collect(Collectors.groupingBy(p->p.getGender()));

        for(Map.Entry<String,List<Employee>> emplist :genderEmps.entrySet()) {
            System.out.print(emplist.getKey() + " ::");
            System.out.print(emplist.getValue());
            System.out.println();

        }

        //partiiotion by age >18
        Map<Boolean, List<Employee>> mapPartioned= employees.stream().collect(Collectors.partitioningBy(p-> p.getAge() > 18));
        for(Map.Entry<Boolean,List<Employee>> emplist :mapPartioned.entrySet()) {
            System.out.print(emplist.getKey() + " ::");
            System.out.print(emplist.getValue());
            System.out.println();

        }
    }
}
