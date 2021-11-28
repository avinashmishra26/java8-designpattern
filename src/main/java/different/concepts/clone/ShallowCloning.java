package different.concepts.clone;

import java.util.Objects;

/**
 * Created by avinash on 30/09/20.
 */
public class ShallowCloning  {

    public static void main(String[] rags) throws CloneNotSupportedException {

        Age age = new Age();
        age.setDay(22);
        age.setMonth(9);
        age.setYear(2020);

        Person person = new Person();
        person.setAge(age);
        person.setId(1);
        person.setName("Athesh");


        Person p = person.clone();



        if(p==person) { //False
            System.out.println("p is equal to person");
        }

        if(p.equals(person)) { //True if 2 person is equal as hashcode are equal
            System.out.println("p is equal to person");
        }

        if(p.getAge() == person.getAge()) { // True as it is shallow copy/clone
            System.out.println("p.getAge() == person.getAge()");
        }
    }

}


class Person implements Cloneable {

    private int id;
    private String name;
    private Age age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result =1;
        result = prime*result + id;
        result = prime*result + name.hashCode();
        result = prime*result + age.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Person pObj= (Person)obj;
        if(age==null){
            if(pObj.getAge()!=null){
                return false;
            }
        } else if(!age.equals(pObj.age)){
            return false;
        }

        if(name==null){
            if(pObj.name!=null){
                return false;
            }
        } else if(!name.equals(pObj.name)){
            return false;
        }

        if(this.id != pObj.id){
            return false;
        }

        return true;

    }

    @Override
    public Person clone() throws CloneNotSupportedException{
        return (Person)super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Age {
    private int day;
    private int month;
    private int year;

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
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Age pObj= (Age)obj;
        if(day != pObj.day){
            return false;
        }

        if(month !=pObj.month){
            return false;
        }

        if(this.year != pObj.year){
            return false;
        }

        return true;

    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime*result + day;
        result = prime*result + month;
        result = prime*result + year;
        return result;
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



