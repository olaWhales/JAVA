public class LogisticFunction{


	public static int deliveryInput(int amount){

	int basePay = 5000 ;
	int amountLess50Percent = 160 ;
	int amountOver50Percent = 200 ;
	int amountOver60Percent = 250 ;
	int amountOver70Percent = 500 ;
	int expectedResult ;



	if(amount >= 70 && amount <= 100){
		expectedResult = amount * amountOver70Percent + basePay ;
			return expectedResult ;

	}else if(amount >= 60 && amount <= 69){
		expectedResult = amount * amountOver60Percent + basePay ;
			return expectedResult ;

	}else if(amount >= 50 && amount <= 59){
		expectedResult = amount * amountOver50Percent + basePay ;
			return expectedResult ;

	}else if(amount <= 50){
		expectedResult = amount * amountLess50Percent + basePay ;
			return expectedResult;

	}else
			expectedResult = 0; 
			return expectedResult;




}
	
}