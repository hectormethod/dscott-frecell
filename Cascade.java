import java.util.Stack;


public class Cascade extends CardCollect  {

	private CardCollect cascade;
	
	public Cascade() {
		this.cascade = new CardCollect();
	}
	
	//constructor to create new Cascade with given card on top
	public Cascade (Cascade cd, Card crd){
		cascade = cd;
	    cascade.pushCard(crd);
		
	}


    @Override
public String toString (){
		StringBuilder result = new StringBuilder();
			result.append("CASCADE: ");
			result.append(super.toString());
		return result.toString();
	}
	
	
	/*Case (1) the stack is empty, 
	 * or (2) the top card is the next higher rank with differing color.
	 */
	
@Override	public boolean playTo(Card card){
		if(cascade.isEmpty()){
			return true;
		} //rank is one higher and card is red, cascade top card is not red.
		else if((card.rank + 1) == cascade.peek().rank && card.isRed() == !cascade.peek().isRed()){
			return true;
		} //rank is one higher and card is black, cascade top card is not black.
		else if((card.rank + 1) == cascade.peek().rank && !card.isRed() == cascade.peek().isRed()){
			return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Cascade cd = new Cascade();
		for (int i = 0; i < 6; i++) {
			cd.pushCard(deck.drawFromDeck());
		}
		System.out.println(cd.toString());

	}

	

}
