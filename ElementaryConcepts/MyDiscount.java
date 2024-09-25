public class MyDiscount{
	public double discount(double price) {

	double rate = 0.15;
	double result = price * rate;
	double total = price - result;
	return total;
}
	public int happy(int number){	

	if(number % 3 == 0 && number % 5 == 0)	
	return number;
	if(number % 3 == 0)
		return number;
	if(number % 5 == 0)
		return number;
	else
		return number;

}
}