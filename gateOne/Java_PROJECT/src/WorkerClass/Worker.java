package WorkerClass;

public class Worker{
    private String name ;
    private String birthDay ;
    String endDate ;


    public Worker(String name , String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.endDate = endDate;
    }


    public int getAge() {
        int currentYear = 2024 ;
        int birthYear = Integer.parseInt(birthDay.substring(5) );
        return birthYear - currentYear ;
    }
    public double collectPay() {
        return 0.0;
    }
    public String terminate(String getEndDate){
        if (getEndDate.equals("endDate")){
            this.endDate = getEndDate;
            return endDate;
        }return getEndDate;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
