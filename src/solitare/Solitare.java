package solitare;

import java.util.ArrayList;
import java.util.Random;

public class Solitare
{
	private ArrayList<Card> deck = new ArrayList<Card>();

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
		shuffle();
		// load board
		// gameloop
		// check win conditions in game loop
	}

	private void shuffle()
	{
		Random r = new Random();
		for (int i = 0; i < deck.size(); i++)
		{
			int swapLocation = r.nextInt(52);
			Card a = deck.get(i);
			Card b = deck.get(swapLocation);
			deck.set(i, b);
			deck.set(swapLocation, a);
		}
	}

	private void printDeck()
	{
		for (int i = 0; i < deck.size(); i++)
		{
			System.out.println(deck.get(i).getDescription());
		}
	}
}