package selection.controller;

import javax.swing.JOptionPane;

import selection.model.Pokemon;
import selection.view.SelectionFrame;

public class SelectionAppController
{
	
	private Pokemon[][] myPokemon;
	private SelectionFrame appFrame;
	
	
	public SelectionAppController()
	{
		mySorter = new SelectionMachine();
		myPokemon = new Pokemon[5][4];
		fillThePokemonList();
		appFrame = new SelectionFrame(this);
	}
	
	private void fillThePokemonList()
	{
		for(int row = 0; row < myPokemon.length; row++)
		{
			for(int col = myPokemon[row].length - 1; col >= 0; col --)
			{
				String name = row + col + "Pokemon";
				int pokedexNumber = ((int) Math.random() * 3);
				boolean evolves = (pokedexNumber%2 == 0);
				int stage = 1;
				String typeOne = "Normal";
				String typeTwo = "Dark";
				myPokemon[row][col] = new Pokemon(name, pokedexNumber, evolves, stage, typeOne, typeTwo);
			}
		}
	}
	public Pokemon[][] getMyPokemon()
	{
		return myPokemon;
	}
	
	public SelectionFrame getAppFrame()
	{
		return appFrame;
	}

	public void start()
	{
		fillTheArrays();
		
	}
	
	private void fillTheArrays()
	{
		fillTheIntArray();
		fillTheDoubleArray();
		fillTheStringArray();
		fillThePokemonArray();
	}
	
	private void fillThePokemonArray()
	{
		myPokemon = new Pokemon[30];
		for(int index = 0; index < myPokemon.length; index++)
		{
			String name = index + " Pokemon";
			int pokedexNumber = (int) (Math.random() * 10);
			boolean evolves = (pokedexNumber % 2 == 0);
			myPokemon[index] = new Pokemon(name, pokedexNumber, evolves);
		}
	}
	
	private void fillTheStringArray()
	{
		
	}
	
	private void fillTheDoubleArray()
	{
		
	}
	
	private void fillTheIntArray()
	{
		integers = new int [3000];
		for(int start = 0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 36000);
		}
	}

}