package Checkout;
import java.util.Scanner;
import java.time.LocalDate;
public class Checkout {
        public static void main(String...args){
            Scanner input = new Scanner(System.in);


            boolean user = true;
            int sum = 0;
            String item = "";
            int quantity = 0;
            int price = 0;
            int discounts = 0;
            int discount = 0;
            float discountgiven ;

            System.out.print("whats the customer's Names: ");
            String customerName = input.nextLine();

            LocalDate todaysDate = LocalDate.now();
            System.out.print("whats did the user buy? ");
            item = input.nextLine();
            do{

                System.out.print("How many pieces? ");
                quantity = input.nextInt();

                System.out.print("How much per Unit: ");
                price = input.nextInt();
                sum = price * quantity ;

                //System.out.print("How much discount will he got? ");
                //discounts = input.nextInt();
                //discount = discounts / 100 * sum;
                //discountgiven = (float)discount;

                System.out.println("Do you want to buy more? (yes/no)");
                String attempt = input.next();
                user = attempt.equalsIgnoreCase("yes");
            }

            while(user);


            System.out.println("==============================================================");
            System.out.printf("%s\n%s\n%s\n%s\n%s","SEMICOLON", "MAIN BRANCH", "LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.","TEL: 08102790000","Cashier: Cashier's Name");
            System.out.println();
            System.out.println("Date: " + todaysDate);
            System.out.println("Customer Name: " + customerName );
            System.out.println("==============================================================");
            System.out.println("		ITEM	QTY	PRICE	TOTAL(NGN)");
            System.out.println("--------------------------------------------------------------");
            System.out.printf("		%4s%6d%9d%9d",item, quantity, price, sum);
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            //System.out.printf("		%s%4d\n		%s%4f", "Sub Total:	", sum, "Discount:	", discountgiven );
            //System.out.println();
            System.out.println("==============================================================");
            System.out.printf("		%4s%9d", "Bill Total",sum);
            System.out.println();
            System.out.println("==============================================================");
            System.out.printf("%s%4d", "THIS IS NOT A RECEIPT KINDLY PAY:  ", sum );
            System.out.println();
            System.out.println("==============================================================");
            System.out.printf("\n\n\n\n");



            System.out.print("How much did the user gave to you? ");
            int paid = input.nextInt();
            int amountPaid = paid - sum;


            System.out.println("==============================================================");
            System.out.printf("%s\n%s\n%s\n%s\n%s","SEMICOLON", "MAIN BRANCH", "LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.","TEL: 08102790000","Cashier: Cashier's Name");
            System.out.println();
            System.out.println("Date: " + todaysDate);
            System.out.println("Customer Name: " + customerName );
            System.out.println("==============================================================");
            System.out.println("		ITEM	QTY	PRICE	TOTAL(NGN)");
            System.out.println("--------------------------------------------------------------");
            System.out.printf("		%4s%6d%9d%9d",item, quantity, price, sum);
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            //System.out.printf("		%s%4d\n		%s%4f", "Sub Total:	", sum, "Discount:	", discountgiven );
            //System.out.println();
            System.out.println("==============================================================");
            System.out.printf("		%4s%9d\n		%4s%9d\n		%4s%9d", "Bill Total:", sum, "Amount Paid:", paid, "Balance:", amountPaid);
            System.out.println();
            System.out.println("==============================================================");
            System.out.println("THANK YOU FOR YOUR PATRONAGE");
            System.out.println("==============================================================");
        }
    }
