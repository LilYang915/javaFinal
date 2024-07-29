package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DECK {


List<CARD> cards = new ArrayList<CARD>(); 

	DECK() {
		String[] names = {"Clubs","Diamonds","Hearts","Spades"};
		int[] numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	for(int number : numbers) {	
		for (String name : names) {
			CARD deck = new CARD(number, name);{
			cards.add(deck);
			}
		}

		}
		
		}


	public List<CARD> getCards() {
		return cards;
	}


	public void setCards(List<CARD> cards) {
		this.cards = cards;
	}
	public void describe() {
	for (CARD cards : this.cards) {
		cards.describe();
	}
}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	
	public CARD draw() {
		 CARD card = cards.remove(0);
		return card;
	}
	
}



