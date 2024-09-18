public class LogisticFunction{
	public static int dispatch(int dispatch){	
	
		int basePay = 5000 ;
			if(dispatch >= 70 && dispatch <= 100){
			int result = dispatch * 500 + basePay ;
			return result ;
			}
			else if(dispatch >= 60 && dispatch < 70){
			int result = dispatch * 250 + basePay ;
			return result ;
			}
			else if(dispatch >= 50 && dispatch < 60){
			int result = dispatch * 200 + basePay ;
			return result ;
			}
			else if(dispatch < 50){
			int result = dispatch * 160 + basePay ;
			return result ;
			}
			else{
			return 0 ;
			}
	}
}