package chapter6;

import java.util.ArrayList;

interface Validate{
    boolean check(Emp emp);
}

class Emp{
    String name;
    int performanceRating;
    double salary;
    Emp(String nm, int rating , double sal){
        name=nm;
        performanceRating = rating;
        salary = sal;
    }
    public String getName(){
        return name;
    }
    public int getPerformanceRating(){
        return performanceRating;
    }
    public double getSalary(){
        return salary;
    }

    public String toString(){
        return name+":"+performanceRating+":"+salary;
    }
}

class ValidatePr implements Validate{
    public boolean check(Emp emp){
        return (emp.getPerformanceRating() >= 5);
    }
}
public class Tesr {
    public static void main(String args[]){
        Emp e1 = new Emp("Shreya",5,9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);

        ArrayList<Emp> empArrList = new ArrayList<> ();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);

     Validate validateperfor = e -> e.getPerformanceRating () >=5;
     filter(empArrList, validateperfor);

    }
    static void filter(ArrayList<Emp> list, Validate rule){
    for(Emp e: list){
        if(rule.check(e)){
            System.out.println (e );
        }
    }
    }
}
