import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualWahala{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
			System.out.println("Welcome!!! you're at the right place ");
				System.out.println();

				System.out.println("Enter start date of your last menstruation, enter with this format yyyy-MM-DD): ");
				String 	lastStartdateString = input.next();

				LocalDate lastStartdate = LocalDate.parse(lastStartdateString);

				System.out.println("How long is your typical menstruation Cycle: ");
				int cycleLength = input.nextInt();

				System.out.println("How many days was last menstruation: ");
				int menstrualDuration = input.nextInt();

					LocalDate lastEnddate = lastStartdate.plusDays(menstrualDuration);
					System.out.println("The End date of your previous period was " + lastEnddate);
	
					System.out.println();
					LocalDate nextStartdate = lastStartdate.plusDays(cycleLength);
					LocalDate nextEnddate = nextStartdate.plusDays(menstrualDuration);
					System.out.println("Your next menstruation start from " + nextStartdate + " and end on " + nextEnddate);

					System.out.println();
					LocalDate ovulationStartdate = lastStartdate.plusDays((cycleLength/2)-2);
					LocalDate ovulationEnddate = ovulationStartdate.plusDays(1);
					System.out.println("Your Ovulation date start from " + ovulationStartdate + " and end on " + ovulationEnddate);

					System.out.println();
					LocalDate safePeriodStart = lastStartdate.plusDays((cycleLength/2) + 2);
					LocalDate safePeriodEnd = safePeriodStart.plusDays((cycleLength/2) -2);
					System.out.println("Your Safe Period calculation start from  " + safePeriodStart + " to " + safePeriodEnd);

				

	}
}
