package WorkerClass;

public class SalaryEmployee {
    static class salaryEmployee extends Employee {
        double annualSalary ;
        boolean isRetire ;

        public salaryEmployee(String name, String birthDay, String hireDate, long employee, double annualSalary, boolean isRetire) {
            super(name, birthDay, hireDate, employee);
            this.annualSalary = annualSalary;
            this.isRetire = isRetire;
        }

        public salaryEmployee(String name, String birthDay, long employee, double annualSalary, boolean isRetire) {
            super(name, birthDay, employee);
            this.annualSalary = annualSalary;
            this.isRetire = isRetire;
        }

        public double collectPay() {
            double payCheck = annualSalary / 12;
            double adjustedPay = (isRetire) ? 9 : payCheck;
            return adjustedPay;
        }

        public void retire(){
            terminate("12-09-2024");
            isRetire = true ;
        }
    }

    public void main() {
    }

}
