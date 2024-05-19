import java.util.*;

class user {

    int limit;
    int points;

    user(){
        limit=10;
        points=0;
    }
	Scanner scan=new Scanner(System.in);

    void check(int r,int l) {

        for(int i=limit-1;i>=0;i--) {

            System.out.print("\nGuess the number between 1 && "+l+" : ");
           
            int sc=scan.nextInt();
            
            if(sc==r){
                System.out.println("Yeah! you found it !") ;
                points++;
				System.out.println("\nYour score : "+points);
				break;
            }
            else if(sc>r){
                System.out.println("you are so high  !!!") ;
		    	if(i==0)
		    		continue;
            	System.out.println ("your's remaining chance : "+i);
               
            }
            else{
                System.out.println("you are too low !!!" );
				if(i==0)
		    		continue;
        		System.out.println ("your's remaining chance : "+i);
            }
        }
		
		System.out.println ("\nGame over !");
        if(points==0){
            System.out.println ("\nThe correct number is : "+r);
       	}
	}
 }
class NumberGuessingGame {
	public static void main(String[] args) {

		int choice=0,rand=0,limits=0,level;
		Random obj= new Random();
		user obj1 = new user();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\tWelcome to Number Guessing Game ");
		System.out.println("\nYou have only 10 chances in this game ...!\n");

	do {
			
			System.out.println("Game levels :-\n");
			System.out.println("\t1. Easy \n");
			System.out.println("\t2. Moderate \n");
			System.out.println("\t3. Hard \n");
			System.out.print("Which level would you prefer to play ? : ");
			level = sc.nextInt();

			if(level == 1){
				rand= obj.nextInt(100);
				limits= 100;
			}
			else if(level == 2){
				rand= obj.nextInt(250);
				limits= 250;
			}
			else if(level == 3){
				rand= obj.nextInt(500);
				limits= 500;
			}
			else{
				System.out.println("Enter the valid level ! : ");
				level = sc.nextInt();
				if(level == 1){
					rand= obj.nextInt(100);
					limits= 100;
				}
				else if(level == 2){
					rand= obj.nextInt(250);
					limits= 250;
				}
				else if(level == 3){
					rand= obj.nextInt(500);
					limits= 500;
				}
        	}
			obj1.check(rand,limits);
			System.out.print("\nDo you like to continue(1 / 0) : ");
			choice = sc.nextInt();
		} while(choice==1);
    		System.out.println("\nYour total score : "+obj1.points);
			System.out.println("\nThank you visit again !\n");
			sc.close();
	}	
 }