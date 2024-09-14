package WorkerClass;

public class WorkerMainMethod {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("olawale", "2020-9-20 " , "2019-3-2", 1);
        Employee secondEmployee = new Employee("ishola" , "2022-1-18", "2020-2-12", 2);

        System.out.println(firstEmployee);
        System.out.println(secondEmployee);

       SalaryEmployee joe = new SalaryEmployee();

        HourlyEmployee mary = new HourlyEmployee("mariam", "1992", "2020", 200 , 1);
        System.out.println(mary);
    }

}
