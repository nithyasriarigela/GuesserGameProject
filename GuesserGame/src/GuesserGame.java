

import java.util.Scanner;

class Guesser{
	
	int guessNum;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess number:");
		
		int guessNum=sc.nextInt();
		
		while(guessNum<1 || guessNum>10) {
			if(guessNum<10) {
				System.out.println("Enter number between 1 to 10");
			}
			else {
				System.out.println("Out of range");
				break;
			}
		}
		return guessNum;
	}
}

class Player{
	int guessNum;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player kindly guess number in range of 1 to 10");
		guessNum=sc.nextInt();
		while(guessNum<1 || guessNum>10) {
			if(guessNum<10) {
				System.out.println("Enter number between 1 to 10");
			}
			else {
				System.out.println("Out of range");
				break;
			}
		}
		
		return guessNum;
	}
	
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayers(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNum();
		
		numFromPlayer2=p2.guessNum();
		
		numFromPlayer3=p3.guessNum();
		
	}
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All players won game");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("P1 and p2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("p1 and p2 won the game");
			}
			else {
				System.out.println("P1 won the game");
			}
			
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer3) {
				System.out.println("p2 and p3 won");
			}
			else{
				System.out.println("p2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("player3 won game");
		}
		else {
			System.out.println("Game Lost Try Again!");
		}
	}
}


public class GuesserGame {
	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
	

}
