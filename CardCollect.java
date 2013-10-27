import java.util.*;


public class CardCollect extends Stack <Card> {
	
	private Stack<Card> cardcollect = new Stack<Card>();

	public CardCollect(){
	
	}
	
	public void pushCard(Card card){
		cardcollect.push(card);
	}
	
	public Card popTopCard(){
		if (cardcollect.isEmpty()) { 
			return null;
			}
		else return cardcollect.pop();  //pop off the top card of the column
	}
	
	public Card peekTopCard(){
		if (cardcollect.isEmpty()){
		return null;
		}
		return cardcollect.peek();
	}
	
	public boolean canPlayFrom(){ //return TRUE if not empty?
		if (cardcollect.isEmpty()){
			System.out.println("COLLECT SAYS: empty");
			return false;
		}
		return true;
	}
	
	/*Given a card to be played to the top of this card stack, 
	 * either make the legal play and return true, or ignore the illegal play and return false.
	 */
	public boolean playTo(Card card){ //implement
		return true;
	}
	
	/*Given a stack from which the top card is to be played to the top of this card stack, 
	*either make the legal play and return true, or ignore the illegal play and return false.*/
	public boolean playTo(CardCollect cards){
		return true;
	}
	
	public Stack<Card> getCards(){
		return cardcollect;
	}
	
	public int size(){
		return cardcollect.size();
	}
	
	@Override public String toString(){
		return cardcollect.toString();
	}
	
	public Card[] toArray(){
		Card[] arr = (Card[]) cardcollect.toArray();
		return arr;   //TODO FIX
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card = deck.drawFromDeck();
		CardCollect cc = new CardCollect();
		cc.pushCard(card);
		System.out.println(cc.peekTopCard()); //print top card.
		System.out.println(cc.canPlayFrom());
		System.out.println("Is the card red? " + cc.peekTopCard().isRed());
		
	}

}
