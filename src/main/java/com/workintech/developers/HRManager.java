package com.workintech.developers;

public class HRManager extends Employee{

    private int id;
    private String name;
    private int salary;
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary){
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[3];
        midDevelopers = new MidDeveloper[3];
        seniorDevelopers = new SeniorDeveloper[3];

    }

    public void addEmployee(JuniorDeveloper developer){
        for(int i= 0; i<juniorDevelopers.length; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Junior developer array is full");
    }
    public void addEmployee(MidDeveloper developer){
        for(int i= 0; i<midDevelopers.length; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Mid developer array is full");
    }
    public void addEmployee(SeniorDeveloper developer){
        for(int i= 0; i<seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = developer;
                return;
            }
        }
        System.out.println("Senior developer array is full");
    }
}
