package war;

public class APP2 {

	public static void main(String[] args) {

		DECK deck = new DECK();
PLAYER player1 = new PLAYER();
//player1.setName("player1");
PLAYER player2 = new PLAYER();
//player2.setName("player2");
deck.shuffle();
//deck.describe();


for (int i = 0; i < 52; i++) {
	if (i % 2 == 0) {
		CARD drawnCard1 = deck.draw();
		player1.getHand().add(drawnCard1);
	} else {
		CARD drawnCard2 = deck.draw();
		player2.getHand().add(drawnCard2);
	}
}

for (int i = 0; i < 26; i++) {

	System.out.println("Round " + i + " Flip!!!");
	
	CARD player1Card = player1.flip();
	CARD player2Card = player2.flip();
	
	System.out.println("player1 flipped");
	player1Card.describe();
	System.out.println("player2 flipped");
	player2Card.describe();
	
	
if (player1Card.getNumber() > player2Card.getNumber())	 {
	System.out.println("player1 wins the round!!");
	player1.score++;
	
} else if (player2Card.getNumber() > player1Card.getNumber()) {
	System.out.println("player2 wins the round!!");
	player2.score++;
}
else {
	System.out.println("DRAW!!! neither player gets the point");
}
	
}
	System.out.println("================= FINAL RESULTS =================");

	int player1Score = player1.getScore();
	int player2Score = player2.getScore();
	System.out.println("Final score for player1 == " + player1Score);
	System.out.println("Final score for player2 == " + player2Score);
	
	if (player1Score > player2Score) {
		System.out.println("player1 won the game");
	} else if (player2Score > player1Score) {
		System.out.println("player2 won the game");
	}
	else if (player1Score == player2Score) {
		System.out.println("DRAW!!!!");
	}


	}

}
