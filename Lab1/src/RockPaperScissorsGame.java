import java.util.*; 
public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		int victoryR1 = 0; // 0 means tie, 1 means player one ,  2 means player 2
		int victoryR2 = 0; 
		int victoryR3 = 0;
		System.out.println("Enter the name of player 1:" );
		String playerOne = input.nextLine(); 
		
		System.out.println("Enter the name of Player 2:" );
		String playerTwo = input.nextLine(); 
		
		System.out.println("======");
		System.out.println("Round 1:");
		System.out.println("======");
		System.out.println("What does " + playerOne + " play? (R, P, or S); ");
		String choiceP1One = input.nextLine().toUpperCase();
		System.out.println("What does " + playerTwo + " play? (R, P, or S); ");
		String choiceP2One = input.nextLine().toUpperCase();
	// -------------------ROUND ONE -----------------------// 	
		if (choiceP1One.equals("R")) { 
			if(choiceP2One.equals("P")) {
				victoryR1 = 2; 
			}
			else if (choiceP2One.equals("S")) {
				victoryR1=1;
			}	
		}
		if (choiceP1One.equals("P")) { 
			if(choiceP2One.equals("R")) {
				victoryR1 = 1; 
			}
			else if (choiceP2One.equals("S")) {
				victoryR1=2;
			}
			
		}	
		if (choiceP1One.equals("S")) { 
			if(choiceP2One.equals("R")) {
				victoryR1 = 2; 
			}
			else if (choiceP2One.equals("P")) {
				victoryR1=1;
			}
			
		}
		// ------------------END of ROUND ONE -----------------------// 	
		// ------------------ROUND TWO -----------------------// 	
		System.out.println("======");
		System.out.println("Round 2:");
		System.out.println("======");
		System.out.println("What does " + playerOne + " play? (R, P, or S); ");
		 choiceP1One = input.nextLine().toUpperCase();
		System.out.println("What does " + playerTwo + " play? (R, P, or S); ");
		 choiceP2One = input.nextLine().toUpperCase();

			if (choiceP1One.equals("R")) { 
				if(choiceP2One.equals("P")) {
					victoryR2 = 2; 
				}
				else if (choiceP2One.equals("S")) {
					victoryR2=1;
				}	
			}
			if (choiceP1One.equals("P")) { 
				if(choiceP2One.equals("R")) {
					victoryR2 = 1; 
				}
				else if (choiceP2One.equals("S")) {
					victoryR2=2;
				}
				
			}	
			if (choiceP1One.equals("S")) { 
				if(choiceP2One.equals("R")) {
					victoryR2 = 2; 
				}
				else if (choiceP2One.equals("P")) {
					victoryR2=1;
				}
				
			}
		// ------------------END of ROUND TWO -----------------------// 	

		if(victoryR1==victoryR2 && victoryR1 != 0 && victoryR2!=0 ) { 
			if(victoryR1==1) { 
				System.out.println("Game over: " + playerOne+" wins!");
			}
			else { 
				System.out.println("Game over: " + playerTwo+" wins!");

			}
		}
		
		else {
			System.out.println("======");
			System.out.println("Round 3:");
			System.out.println("======");
			System.out.println("What does " + playerOne + " play? (R, P, or S); ");
			 choiceP1One = input.nextLine().toUpperCase();
			System.out.println("What does " + playerTwo + " play? (R, P, or S); ");
			 choiceP2One = input.nextLine().toUpperCase();

				if (choiceP1One.equals("R")) { 
					if(choiceP2One.equals("P")) {
						victoryR3 = 2; 
					}
					else if (choiceP2One.equals("S")) {
						victoryR3=1;
					}	
				}
				if (choiceP1One.equals("P")) { 
					if(choiceP2One.equals("R")) {
						victoryR3 = 1; 
					}
					else if (choiceP2One.equals("S")) {
						victoryR3=2;
					}
					
				}	
				if (choiceP1One.equals("S")) { 
					if(choiceP2One.equals("R")) {
						victoryR3 = 2; 
					}
					else if (choiceP2One.equals("P")) {
						victoryR3=1;
					}
					
				}
			
			if( victoryR3 != 0 ) { 
				if(victoryR3==1) { 
					System.out.println("Game over: " + playerOne+" wins!");
				}
				else if (victoryR3==2){ 
					System.out.println("Game over: " + playerTwo+" wins!");

				}
			}
			else { 
				System.out.println("Game over: a tie between " + playerOne+ " and " + playerTwo);

				
			}
		}
		
		input.close();
		}
	}

