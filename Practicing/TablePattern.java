public class TablePattern{
	public static void main(String [] args){

	System.out.println("Category A");
	for(int i = 1 ; i <=6 ; i++){
		for(int j = 1 ; j <= i ; j++){
		System.out.print(j+" ");
		}

		System.out.println();
	}
		System.out.println();


	System.out.println("Category B");

	for(int i = 1 ; i <= 6 ; i++){
		for(int j = 6 ; j>= i ; j--){
		System.out.print(j+" ");
		}
		System.out.println();
	}
		System.out.println();



	System.out.println("Category C");

	for(int i = 1 ; i <= 6 ; i++){
		for(int j = 6; j >= i ; j--){
		System.out.print(j+" ");
		}
		System.out.println();
	}
		System.out.println()

	System.out.println("Category D");
	for(num = 1 ; num <= 6 ; num++){
		for(int j = 6 ; j>= num ; j--){
		System.out.print(j+" ");
		num = num -1 ;
		}
		System.out.println();
	}


	}		
}