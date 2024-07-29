package war;

import java.util.ArrayList;
import java.util.List;


public class PLAYER {
	
	public PLAYER(){}
	
	int score = 0;
	String name = "";
List <CARD> hand = new ArrayList<CARD>(); 
	

	public PLAYER (String name, List<CARD> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}

  public void describe (PLAYER player) {
		System.out.println(player.getName().concat("Has the following cards"));
		CARD card = new CARD(score, name);
		for (int i = 0; i < hand.size(); i++) {
			System.out.println(card.describe());
		}
		} 
		
	public CARD flip() {
			return hand.remove(0);
			
		}
		
		
	public int incrementScore() {
			this.score = 0; {
				return score++; 
}}
		
	public List<CARD> getHand() {
		return hand;
	}

	public void setHand(List<CARD> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

