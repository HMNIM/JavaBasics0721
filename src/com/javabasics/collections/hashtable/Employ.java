package com.javabasics.collections.hashtable;

public class Employ {
    int id;
    String name;
    double salary;

    public Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        System.out.println("In hashcode");
        return this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        Employ e = null;
        if(obj instanceof Employ){
            e = (Employ) obj;
        }
        System.out.println("In equals");
        if(this.getId() == e.getId()){
            return true;
        } else {
            return false;
        }

    }


}
