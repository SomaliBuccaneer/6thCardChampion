
//This class represents a single playing card.

//This class is immutable. Once an object is constructed,
//there are no setter (mutator) functions to change its state.

//Deck values: 1-52 (Clubs, Diamonds, Hearts, Spades)
//Face values: 2-14 (2-10, J, Q, K, A)
// Suit values: 1-4 (Clubs, Diamonds, Hearts, Spades)

public class Card {
	//Suit value constants:
	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;
	
	//Suit name constants:
	private final String[] suitNames = new String[]
	{
		"cluds", "diamonds", "hearts", "spades"	 
	};
	
	//Face value constants:
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	
	//Face name constants:
	private final String[] faceName = new String[]
	{
		"2", "3", "4", "5", "6", "7", "8", "9", "10",
		"Jack", "Queen", "King", "Ace"
	};
	
	//Card values:
	private final int deckValue; //1-52 (C, D, H, S)
	private final int faceValue; // (2-10, J, Q, K, A)
	private final int suitValue; //1-52 (C, D, H, S)
	
	public Card(int deckValue){
		
		//Guard against an invalid state:
		if((deckValue < 1) || (deckValue > 52))
		{
			throw new IllegalArgumentException();
		}
		
		this.deckValue = deckValue;
		faceValue = toFaceValue(deckValue);
		suitValue = toSuitValue(deckValue);
	}
	
	public Card(int faceValue, int suitValue, int deckValue)
	{
		//Guard against an invalid state:
		if((deckValue) < 2 || (deckValue > 14))
		{
		throw new IllegalArgumentException();
		}
		if((suitValue < 1) || (suitValue > 4))
		{
			throw new IllegalArgumentException();
		}
		
		this.faceValue = faceValue;
		this.suitValue = suitValue;
		this.deckValue = toDeckValue(faceValue, suitValue);
		}
		
		public boolean equals(Object other)
		{
			if(!(other instanceof Card))
			{
				return false;
			}
			Card cardOther = (Card)other;
			if(deckValue != cardOther.deckValue)
			{
				return false;
			}
			return true;
		}
		
		public int getDeckValue()
		{
			return deckValue;
		}
		
		public String getFaceName()
		{
			return faceName[faceValue - 2];
		}
		
		public int getFaceValue()
		{
			return faceValue;
		}
		
		public String getSuitName()
		{
			return suitNames[suitValue - 1];
		}
		
		public int getSuitValue()
		{
			return suitValue;
		}
		
		public static int toDeckValue(int faceValue, int suitValue)
		{
			//Guard against an invalid state:
			if((faceValue < 2) || (suitValue > 14))
			{
				throw new IllegalArgumentException();
			}
			if((suitValue < 1) || (suitValue > 4))
			{
				throw new IllegalArgumentException();
			}
			
			int deckValue = (13 * (suitValue - 1)) + faceValue - 1;
			return deckValue;
		}
		
		public static int toFaceValue(int deckValue)
		{
			int faceValue = (deckValue % 13) +1;
			if(faceValue == 1)
			{
				faceValue = 14;
			}
			return faceValue;
		}
		
		public String toString()
		{
			String string = getFaceName() + " of " + getSuitName();
			return string;
		}
		
		public String toStringBrief()
		{
			String faceBrief;
			if(faceValue <= 10)
			{
				faceBrief = getFaceName();
			}
			else
			{
				faceBrief = getFaceName().substring(0, 1);
			}
			String suitBrief = getSuitName().substring(0, 1);
			String brief = faceBrief + suitBrief;
			return brief;
		}
		
		public static int toSuitValue(int deckValue)
		{
			int suitValue = deckValue / 13;
			if(deckValue % 13 != 0)
			{
				suitValue++;
			}
			return suitValue;
		}
	}
	

