package org.example;

import java.util.ArrayList;
import java.util.List;
public class WildcardsExample {

    public static class Person {
        public String name;

        Person(String name){
            this.name = name;
        }
    }

    public static class Doctor extends Person {
        Doctor(String name){
            super(name);
        }
    }

    public static void printNameForPerson(Person p){
        System.out.println(p.name);
    }

    // [1] Passing ArrayList<Doctor> in place of Arraylist<Person> not allowed by default way
    // public static void printNameForPeople(List<Person> p){
    //     System.out.println(p.get(0).name);
    // }
    
    public static void printNameForPeople(List<? extends Person> p){
        System.out.println(p.get(0).name);
    }

    public static void printNameForDoctors(List<? super Doctor> p){
        System.out.println(((Person)p.get(0)).name); // Casting to Person
    }
    
    public static void main(String[] args) {
        Person p = new Person("ABC");
        List<Person> people = new ArrayList<>();
        people.add(p);
        printNameForPerson(p);
        printNameForPeople(people);
        printNameForDoctors(people);

        Doctor d =  new Doctor("CAB");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(d);
        printNameForPerson(d);
        printNameForPeople(doctors);
        // printNameForDoctors(doctors);
        //printNameForPeople(doctors); [1] THIS DOESN'T WORK
    }
    
}
