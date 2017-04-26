package solitare;

public class Card
{
	private int cardNumber;
	private int cardSuit;

	public Card(int cardSuit, int cardNumber)
	{
		this.setCardNumber(cardNumber);
		this.setCardSuit(cardSuit);
	}

	public int getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(int cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public int getCardSuit()
	{
		return cardSuit;
	}

	public void setCardSuit(int cardSuit)
	{
		this.cardSuit = cardSuit;
	}

	public String getCardSuitName()
	{
		switch (cardSuit)
		{
		case 1:
			return "Spades";
		case 2:
			return "Clubs";
		case 3:
			return "Hearts";
		case 4:
			return "Diamonds";
		}
		return "No Suit Value";
	}

	public String getDescription()
	{
		return "Value: " + cardNumber + " Suit: " + getCardSuitName();
	}

}
