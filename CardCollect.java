import java.util.*;


public class CardCollect extends Stack <Card> {
	
	//private Stack<Card> cardcollect = new Stack<Card>();

	public CardCollect(){
	
	}
	
	public void pushCard(Card card){
		push(card);
	}
	
	public Card popTopCard(){
		if (isEmpty()) {
			return null;
			}
		else return pop();  //pop off the top card of the column
	}
	
	public Card peekTopCard(){
		if (isEmpty()){
		return null;
		}
		return peek();
	}
	
	public boolean canPlayFrom(){ //return TRUE if not empty?
		if (isEmpty()){
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

    //you don't need a method for this.  CardCollect /is/ a Stack of Cards so you can use the
    //instantiated object whenever you would use this method
//	public Stack<Card> getCards(){
//		return cardcollect;
//	}
	
	public int size(){
		return super.size(); //see how this is redundant?
		// since Stack has a size() and CardCollect is a Stack, we can just use CardCollect.size() without
        //implementing this method.
	}

    //this is redundant as well.
//	@Override public String toString(){
//		return cardcollect.toString();
//	}
	
	public Card[] toArray(){
		//Card[] arr = (Card[]) cardcollect.toArray();
		//return arr;   //TODO FIX
        return toArray();
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
