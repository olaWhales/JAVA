import java.util.Scanner;

public class ReverseNO6 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int user = input.nextInt();

	int rev = 0 ;
	while(user > 0){
		rev = (user % 10 + rev * 10) ; 
		user = user / 10;
	}
		System.out.print(rev);
/*
	 
	for(int count = 0 ; count <= user ; count++){
		String reverse = String.charAT(user);
		System.out.print(reverse);
**/		

    }
}
