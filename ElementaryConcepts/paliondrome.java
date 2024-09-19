public class Palindrometesting{

	int number = num ;
	int palindrome = 0 ;

	while(number != 0){
		int num = input.nextInt();
	
		num = num * 10 + palindrome % 10 ;
		palindrome = palindrome // 10 ;
		
		if(number == palindrome);
			System.out.print("It's a palindrome");
		else
			System.out.print("Not a palindrome");

		}

}