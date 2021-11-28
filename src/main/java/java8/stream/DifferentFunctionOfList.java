package java8.stream;

import java8.stream.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by avinash on 11/10/20.
 */
public class DifferentFunctionOfList {

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


        //Finding average using Collectors
        double avg  = employees.stream().collect(Collectors.summingDouble(e -> e.getId()))/employees.stream().count();

        System.out.println(avg);


        //Other options available for finding aggregate fnc
        System.out.println(employees.stream().mapToInt(x -> x.getId()).summaryStatistics());

        System.out.println(employees.stream().mapToInt(x -> x.getId()).sum());

        System.out.println("SUM using reduce :: "+employees.stream().map(e -> e.getId()).reduce(0,(s,e) -> e+s));

        System.out.println(employees.stream().mapToInt(x -> x.getId()).average());

        System.out.println(employees.stream().mapToInt(x -> x.getId()).max());

        System.out.println(employees.stream().mapToInt(x -> x.getId()).min());



        //sorted by name
        System.out.println("sorted ::");
        employees.stream().map(p -> p.getFirstName()).sorted().forEach(n -> System.out.print(n+" "));

        List<Employee> employees1 = employees.stream().sorted((emp1,emp2) -> emp1.getLastName().compareTo(emp2.getLastName())).collect(Collectors.toList());

        System.out.println();
        System.out.println("sorted 1 ::"+employees1);

        //findAny findFirst
        Optional<Employee> employee1 = employees.stream().filter(p -> p.getGender().equalsIgnoreCase("M")).findAny();
        System.out.println("findAny ::" +employee1.get());

        Employee employee2 = employees.stream().filter(p -> p.getGender().equalsIgnoreCase("M")).findFirst().get();
        System.out.println("findFirst ::" +employee2);


    }
}
