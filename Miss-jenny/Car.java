public class Car{

private String model ;
private String year ; 
private double price ;


public Car(String model, String year, double price){
this.model = model ;
this.year = year ;
this.price = price ;
}
	public void setModel(){
	}
	public void setYear(){
	}
	public void setPrice(){
	}
		public String getModel(){
		return model ;
		}
		public String getYear(){
		return year ; 
		}
		public double getPrice(){
		return price ;
		}
			public double calculateFirstCarDiscount(){
			double amount = price ;
			double discount = price * (5 * 0.01) ;
			double result = amount - discount;
			return result ;
			}
			public double calculateSecondCarDiscount(){
			double amount = price ;
			double discount = price * (7 * 0.01) ;
			double result = amount - discount;
			return result ;
			}
 

}


