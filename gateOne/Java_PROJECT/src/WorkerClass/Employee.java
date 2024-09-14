package WorkerClass;

public class Employee extends Worker {
    private long employee ;
    private String hireDate ;

    public Employee(String name, String birthDay, String hireDate, long employee) {
        super(name, birthDay);
        this.hireDate = hireDate;
        this.employee = employee;
    }

    private static int employeeNumber = 1;

    public Employee(String name, String birthDay, long employee) {
        super(name, birthDay);
        this.employee = employee;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employee=" + employee +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
