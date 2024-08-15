public class PetrolPurchase{
	private String petrol ;
	private String quantity ;
	private int purchase ;
	private Double price ;
	private Double discount ;

	public PetrolPurchase (String petrol, String quantity, int purchase, Double price , Double discount){
	this.petrol = petrol ;
	this.quantity = quantity ;
	this.purchase = purchase ;
	this.price = price ;
	this.discount = discount ;	
	}
		public void setPrice(double price, int purchase){
			if(price == 50){
				purchase = 5;
				price++ ;
		  	}
		   	else if(price < 5){
			System.out.print("Enter a valid thins");
			}
		}
		public void setPuchase(int purchase){ 
			if(purchase == 5 || purchase > 5){
				purchase++ ;
			}else{
			System.out.print("The petrol start from 5L ");		
			}
		}	
		public void setDiscount(Double discount, int purchase, Double price){
			discount = 0.2 - (purchase * price) ; 
		}

			public String buyPetrol(String quantity, int purchase, Double price)(){
				return petrol;
			}
			public String getQuantity(){
				return quantity ;
			}
			public int getPurchase(){
				return purchase ;
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

}
