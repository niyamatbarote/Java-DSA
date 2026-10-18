package DSA.OOPS.Encapsulation;

public class EmployeeDriver {

    // Utility Method :
    public static void displayEmployeeDetails(Employee e) {
        // Retrieving Data Using GETTERS :
        System.out.println("=================== EMPLOYEE DETAILS =====================");
        System.out.println("name : " + e.getName());
        System.out.println("empid : "+e.getEmpid());
        System.out.println("salary : "+e.getSalary());
        System.out.println("designation : "+ e.getDesignation());
        e.working();
        System.out.println("==========================================================");
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Niyamat",12,7_00_000,"Java Developer");
        displayEmployeeDetails(e1);

        // Making changes in Employee e2 Object Using SETTERS
        e1.setName("Niyamat Barote");
        e1.setDesignation("Senior Java Developer");
        e1.setSalary(9_00_000);

        // Printing Changed Info :
        displayEmployeeDetails(e1);

        Employee e2 = new Employee("Pranav" , 43, 8_00_000, "Python Developer");
        displayEmployeeDetails(e2);

        // Making changes in Employee e2 Object Using SETTERS
        e2.setName("Pranav D");
        e2.setSalary(7_00_000);

        // Printing Changed Info :
        displayEmployeeDetails(e2);

    }
}
