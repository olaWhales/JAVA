import java.util.Scanner;
public class NokiaMenu{
public static void main(String[]args){

	Scanner input = new Scanner(System.in);


	System.out.print("""
			1.Phone book
			2.Message
			3.Chat
			4.Call register
			5.Tone
			6.Setting
			7.Call divert
			8.Game
			9.Calculate
			10.Register
			""");
	int power = input.nextInt();

		
		switch (power) {

		case 1 : System.out.println(" Phonebook");
				System.out.println(""" 

						1.Search
						2.Service No
						3.Add name
						4.Erase
						5.Edit
						6.Assign tone
						7.Send b'card
						8.Option
						9.Speed
						10.Voice tag

						""");

			int phonebook = input.nextInt();

		
					switch(phonebook){
						case 1: System.out.print(" Search");
								break;
						case 2: System.out.print(" Service Nos");
								break;
						case 3: System.out.print(" Add name");
								break;
						case 4: System.out.print(" Erase");
								break;
						case 5: System.out.print(" Edit");
								break;
						case 6: System.out.print(" Assign tone");
								break;
						case 7: System.out.print(" Send b'card");
								break;
						case 8: System.out.println(" Options");
							System.out.println("""
									1. Type of view
									2. Memory status
									""");
							int Option = input.nextInt();
							
								switch(Option){

								case 1: System.out.print(" Type of view");
										break;
								case 2: System.out.print(" Memory status");
										break;
								}
								break;
						case 9: System.out.println(" Speed dials");
								break;
						case 10: System.out.println(" Voice tags");
								break;
							default: System.out.print("Invalid:");

					}




			break;

		case 2 : System.out.println(" Message");
			System.out.println("""
					1.Write message
					2.Inbox
					3.Outbox
					4.picture message
					5.Template
					6.Smileys
					7.Message setting
					""");
			int message = input.nextInt();
						switch(message){
						case 1: System.out.print(" Write message");
								break;
						case 2: System.out.print(" Inbox");
								break;
						case 3: System.out.print(" Outbox");
								break;
						case 4: System.out.print(" picture message");
								break;
						case 5: System.out.print(" Template");
								break;
						case 6: System.out.print(" Smileys");
								break;
						case 7: System.out.print(" Message setting");
							System.out.print("""
									1.Message center number
									2.Message sent as
									3.Message vality
									""");
							int inside = input.nextInt();
									switch(inside){
										case 1: System.out.print("Message center number");
											break;
										case 2: System.out.print("Message sent as");
											break;
										case 3: System.out.print("Message vality");
											break;
											    default: 
											System.out.print("Invalid");
											}
								

							System.out.print("Common");
							System.out.println("""
									1.Delivery report
									2.Reply via same center
									3.Reply via same centent
									""");
							int common = input.nextInt();
									switch(common){
										case 1: System.out.print("Delivery report");
											break;
										case 2: System.out.print("Reply via same center");
											break;
										case 3: System.out.print("Reply via same centent");
											break;
											    default:
											System.out.print("Invalid");
											}

						}
			
			break;
		case 3 : System.out.print(" Chat");
			break;

		case 4 : System.out.println(" Call register");
			System.out.println("""
					1.Missed call
					2.Received call
					3.Dialled
					4.Erase recent
					5.Show call duration
					6.Show call cost
					7.Call cost setting
					8.Prepaid credit
					""");
			int call = input.nextInt();
					switch(call){
						case 1: System.out.print("Missed call");
								break;
						case 2: System.out.print("Received call");
								break;
						case 3: System.out.print("Dialled");
								break;
						case 4: System.out.print("Erase recent");
								break;
						case 5: System.out.print("Show call duration");
							System.out.print("""
									1.Last call duration
									2.All calls' duration
									3.Received call duration
									4.Dialled call's duration
									5.Clear timer
									""");
							int duration = input.nextInt();
									switch(duration){
										case 1: System.out.print("Last call duration");
											break;
										case 2: System.out.print("All calls' duration");
											break;
										case 3: System.out.print("Received call duration");
											break;
										case 4: System.out.print("Dialled call's duration");
											break;
										case 5: System.out.print("Clear timer");
											break;
											    default:
											System.out.print("Invalid");
										}
								break;
						case 6: System.out.print("Show call cost");
							System.out.print("""
									1.Last call duration
									2.All calls'' duration
									3.Clear counter
									""");
							int cost = input.nextInt();
									switch(cost){
										case 1: System.out.println("Last call duration");
											break;
										case 2: System.out.print("All calls' duration");
											break;
										case 3: System.out.print("Clear counter");
											break;
											    default:
											System.out.print("Invalid");
											}
									



								break;
						case 7: System.out.print("Call cost setting");
									
								break;
						case 8: System.out.print("Prepaid credit");
								break;
								default:
								System.out.print("End of page");
						}

			break;

		case 5 : System.out.println(" Tone");
			System.out.println("""
					1.Ringing
					2.Ringing volume
					3.Incoming call alert
					4.Composer
					5.Message
					6.Keypad
					7.Warming
					8.Vibration
					9.Screen saver
					""");
			int tone = input.nextInt();
					switch(tone){
						case 1: System.out.print(" Ringing");
							break;
						case 2: System.out.print(" Ringing volume");
							break;
						case 3: System.out.print(" Incoming call alert");
							break;
						case 4: System.out.print(" Conposer");
							break;
						case 5: System.out.print(" Message");
							break;
						case 6: System.out.print(" Keypad");
							break;
						case 7: System.out.print(" Warming");
							break;
						case 8: System.out.print(" Vibration");
							break;
						case 9: System.out.print(" Screen saver");
							break;
							    default:
System.out.print("Go back");

						}
			break;		

		case 6 : System.out.println(" Settings");
			System.out.print("""
					1.Call settings
					2.Phone settings
					3.Security settings
					4.Restore factory settings
					""");
			int settings = input.nextInt();
					switch(settings){
						case 1: System.out.println(" Call settings");
				System.out.println("""
						1.Automatic redial
						2.Speed dialing
						3.Call waiting option
						4.Own number sending
						5.Phone line in use
						6.Automatic
						""");
				int setting = input.nextInt();
						switch(setting){		
								case 1:  System.out.print(" Automatic redial");
									break;
								case 2:  System.out.print(" Speed dialing");
									break;
								case 3:  System.out.print(" Call waiting option");
									break;
								case 4:  System.out.print(" Own number sending");
									break;
								case 5:  System.out.print(" phone line in use");
									break;
								case 6:  System.out.print(" Automatic");
									break;
									    default:
										System.out.print("Go back");
								}


							break;
						case 2: System.out.println(" Phone settings");
								System.out.print("""
										1.Language
										2.Cell info display
										3.Welcome note
										4.Network selection
										5.Light	
										6.Confirm SIM service actions
									""");
								int phone = input.nextInt();
									switch(phone){
								case 1:  System.out.print(" Language");
									break;
								case 2:  System.out.print(" Cell info display");
									break;
								case 3:  System.out.print(" Welcome note");
									break;
								case 4:  System.out.print(" Network selection");
									break;
								case 5:  System.out.print(" Light");
									break;
								case 6:  System.out.print(" Confirm SIM service action");
									break;
								
										}
										

							break;
						case 3: System.out.println("Security Settings");
								System.out.print("""
										1.PIN code request
										2.Call bearing service
										3.Fixed dialing
										4.Closed user group
										5.Phone security
										6.Change access codes
									""");
								int security = input.nextInt();
									switch(security){
								case 1:  System.out.print(" PIN code request");
									break;
								case 2:  System.out.print(" Call bearing service");
									break;
								case 3:  System.out.print(" Fixed dialing");
									break;
								case 4:  System.out.print(" Closed user group");
									break;
								case 5:  System.out.print(" Phone security");
									break;
								case 6:  System.out.print(" Change access codes");
									break;
									    default:
										System.out.print("Go back");
										}
							break;
						case 4: System.out.println("Restore factory Settings");
							break;

					} 








			break;

		case 7 : System.out.print(" Call divert");
			break;

		case 8 : System.out.print(" Game");
			break;

		case 9 : System.out.print(" Calculator");
			break;

		case 10 : System.out.print(" Reminder");
			break;

		case 11 : System.out.print(" Clock");
								System.out.print("""
										1.Alerm clock
										2.Clock settings
										3.Date setting
										4.Stop watch
										5.Counter down
										6.Auto update of date and time
									""");
								int security = input.nextInt();
									switch(security){
								case 1:  System.out.print(" Alerm clock");
									break;
								case 2:  System.out.print(" Clock settings");
									break;
								case 3:  System.out.print(" Date setting");
									break;
								case 4:  System.out.print(" Closed user group");
									break;
								case 5:  System.out.print(" Counter down");
									break;
								case 6:  System.out.print(" Auto update of date and time");
									break;
										}


			break;

		case 12 : System.out.print(" Profile");
			break;

		case 13 : System.out.print(" SIM services");
			break;

}

	
		
	

}
	

}