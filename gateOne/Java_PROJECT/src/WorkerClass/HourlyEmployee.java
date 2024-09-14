package WorkerClass;

class HourlyEmployee extends Employee {
    private double hourlyPay ;

    public HourlyEmployee(String name, String birthDay, String hireDate, long employee, double hourlyPay) {
        super(name, birthDay, hireDate, employee);
        this.hourlyPay = hourlyPay;
    }

    public double collectPay(double pay){
        return 40 * hourlyPay;
    }
    public double getDoublePay(){
        double pay = hourlyPay;
        return 2 * collectPay(pay);
    }
}
