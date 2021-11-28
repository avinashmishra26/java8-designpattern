package different.concepts.immutable;

/**
 * Created by avinash on 30/09/20.
 */
public class Immutable_Class_2 {

    public static void main(String[] args){

        Age  age = new Age();
        age.setDay(22);
        age.setMonth(9);
        age.setYear(2020);

        Depart  depart = new Depart(1, "Avinash", age);

        System.out.print(depart);

        depart.getAge().setDay(23);

        System.out.print(depart);


    }
}


final class Depart {
    final int rollNo;
    final String name;
    final Age age;

    public Depart(int rollNo, String name,Age age){
        this.rollNo=rollNo;
        this.name=name;

        // this.age = age; don't do this rather clone it
        Age age1 = new Age();
        age1.setDay(age.getDay());
        age1.setMonth(age.getMonth());
        age1.setYear(age.getYear());

        this.age = age1;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {


        // return age;; don't do this rather clone it
        Age age1 = new Age();
        age1.setDay(this.age.getDay());
        age1.setMonth(this.age.getMonth());
        age1.setYear(this.age.getYear());
        return age1;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Age {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Age{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}