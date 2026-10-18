package DSA.OOPS.Encapsulation;

// DATA HIDING :

public class Employee {

    // Properties :
    private String name;
    private int empid;
    private double salary;
    private String designation;

    // Behaviours :
    public void working() {
        System.out.println(name+" is working as "+designation);
    }

    // Getters
    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Parameterized Constructor :
    Employee(String name, int empid , double salary, String designation) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
        this.designation = designation;
    }

}
