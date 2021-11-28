package different.concepts.serialization;

import java.io.Serializable;

/**
 * Created by avinash on 01/10/20.
 */
public class Age{
    private int day;
    private int month;
    private int year;

    public Age(){
        System.out.println("in Age::constructor Default");
    }

    public Age(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("in Age::constructor Paramter");
    }

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
