package solitare;

import java.util.ArrayList;

public class Solitare
{
	ArrayList<Card> deck = new ArrayList<Card>();

	public Solitare()
	{
		// create a deck
		for (int i = 1; i < 5; i++)
		{
			// System.out.println(i);
			for (int j = 1; j < 14; j++)
			{
				// System.out.println(j);
				deck.add(new Card(i, j));
			}
		}
		 printDeck();
		// randomize deck
		// load board
		// gameloop
		// check win conditions in game loop
	}

	private void printDeck()
	{
		for (int i = 0; i < deck.size(); i++)
		{
			System.out.println(deck.get(i).getDescription());
		}
	}
}