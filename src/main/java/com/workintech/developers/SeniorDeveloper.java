package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, String name, int salary){
        super(id,name, salary);
    }

    @Override
    public void work(){
        System.out.println("Senior Developer starts to work");
        setSalary(getSalary() + 2000);
    }
}
