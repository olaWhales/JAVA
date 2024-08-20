public class PetrolPurchase{
	private String petrolLocation ;  
	private String petrolType ;
	private int quantity ;
	private Double price ;
	private Double discount ;

	public PetrolPurchase (String petrolLocation, String petrolType, int quantity, Double price , Double discount){
	this.petrolLocation = petrolLocation ;
	this.petrolType = petrolType ;
	this.price = price ;
	this.quantity = quantity ;
	this.discount = 0.05 ;
	this.discount = discount ;

	}
			public String getPetrolLocation(){
			return petrolLocation;
			}
			public String getPetrolType(){
				return petrolType ;
			}
			public int getQuantity(){
				return quantity ;
			}
			public Double getPrice(){
				return price ;
			}
			public Double getDiscount(){
				return discount ;
			}
			public String toString(){
				return String.format("""
					Welcome to Olawale petroleum hub
					kindly switch off your phone and 
					dont play mad. 
				""");
			}
		public double discountCalculation(){
			double amount = price * quantity ;
			double totalDiscountCal = amount * (discount  * 0.01);
			double result = amount - totalDiscountCal ;
			return result;
		}
}
