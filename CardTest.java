//This class tests the Card class.
public class CardTest {

	public static void main(String[] args) {
		System.out.println("Testing the Card Class: ");
		CardTest test = new CardTest();
		
		test.cardToString();
		//test.cardToStringBrief();
		test.cardToDeckValue();
		test.cardEquals();
		test.illegalArguments(); //Uncomment to test
		
		System.out.println();
	}
	
	private void cardToString()
	{
		System.out.println("\n******** Cards.toString(): ***********");
		
		for(int i = 1; i <= 52; i++)
		{
			Card card = new Card(i);
			System.out.println(card.toString());
			if(i % 13 == 0)
			{
				System.out.println();
			}
		}
	}
	
	private void cardToDeckValue()
	{
		System.out.println("\n******** Cards.toDeckValue(): *************");
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 2; j <= 14; j++)
			{
				System.out.println((new Card(j, i)).toString() + ": " +
									Card.toDeckValue(j, i));
			}
			System.out.println();
		}
	}
	private void cardEquals()
	{
		System.out.println("\n********** Card.equals(): *****************");
		
		Card card1 = new Card(12);
		Card card2 = new Card(25);
		System.out.println(card1.toString() +
				((card1.equals(card2)) ? " == " : " != ") +
				card2.toString());
		Card card3 = new Card(52);
		Card card4 = new Card(52);
		System.out.println(card3.toString() +
				((card3.equals(card4)) ? " == " : " != ") +
				card4.toString());
	}
	
	//Causes an IllegalArguments exception.
	private void illegalArguments()
	{
		System.out.println("\n************ Illegal arguments: *************");
		
		Card card = new Card(53);
		System.out.println(card.toString());
	}
}

