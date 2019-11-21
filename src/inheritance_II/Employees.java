package inheritance_II;

import java.util.Arrays;

class Employee {

    // Employee is the base class. It includes three fields (name, email and experience),
    // one constructor with three arguments and
    // three getters: getName(), getEmail(), getExperience().

    // write fields
    protected String name;
    protected String email;
    protected int experience;

    // write constructor
    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);

        System.out.println(developer.getName() + " | " + developer.getEmail() + " | " + developer.getExperience() +
                " | " + developer.getMainLanguage() + " | " + Arrays.toString(developer.getSkills()));

        System.out.println(analyst.getName() + " | " + analyst.getEmail() + " | " + analyst.getExperience() +
                " | " + analyst.isPhD() + " | " + Arrays.toString(analyst.getMethods()));
    }

}

class Developer extends Employee {

    // Developer is a subclass. It includes fields from the base class and two additional
    // fields (mainLanguage, skills), one constructor with five arguments and
    // two getters: getMainLanguage(), getSkills().

    // write fields
    protected String mainLanguage;
    protected String [] skills;

    // write constructor
    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // DataAnalyst is another subclass. It includes fields from the base class and
    // two additional fields (phd, methods), one constructor with five arguments and
    // two getters: isPhD(), getMethods().

    // write fields
    protected boolean phd;
    protected String [] methods;

    // write constructor
    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods){
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    // write getters
    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}
