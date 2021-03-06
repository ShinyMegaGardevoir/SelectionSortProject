package selection.model;

public class Pokemon
{
	private String name;
	private int pokedexNumber;
	private boolean evolves;
	private int stage;
	private String typeOne;
	private String typeTwo;
	
	public Pokemon(String name, int pokedexnumber, boolean evolves)
	{
		
		
		
		
		
	}
	
	
	
	@Override
	public String toString()
	{
		String pokemonString = "";
		pokemonString += "Pokemon: " + name + "";
		pokemonString += "Pokedex Number: #" + pokedexNumber + "";
		pokemonString += "Evolves: " + evolves + "";
		if(evolves)
		{
			pokemonString += "This Pokemon can evolve.";
		}
		else
		{
			pokemonString += "This Pokemon does not evolve.";
		}
		pokemonString += "Stage " + stage + "";
		if(typeOne.equals("Normal"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Grass"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Water"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Fire"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Flying"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Bug"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Poison"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Ice"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Rock"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Ground"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Steel"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Dark"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Ghost"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Dragon"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Psychic"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Electric"))
		{
			pokemonString += "" + typeOne + "";
		}
		else if(typeOne.equals("Fairy"))
		{
			pokemonString += "" + typeOne + "";
		}
		
		return pokemonString;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPokedexNumber()
	{
		return pokedexNumber;
	}
	public void setPokedexNumber(int pokedexNumber)
	{
		this.pokedexNumber = pokedexNumber;
	}
	public boolean getEvolves()
	{
		return evolves;
	}
	public void setEvolves(boolean evolves)
	{
		this.evolves = evolves;
	}



	public int compareTo(Pokemon otherPokemon)
	{
		int comparedValue = 0;
		
		if(otherPokemon instanceof Pokemon)
		{
			if(this.pokedexNumber < ((Pokemon) otherPokemon).getPokedexNumber())
			{
				comparedValue = -1;
			}
			else if(this.pokedexNumber > ((Pokemon) otherPokemon).getPokedexNumber())
			{
				comparedValue = 1;
			}
		}
		else
		{
			comparedValue = Integer.MIN_VALUE;
		}
		
		return comparedValue;
	}

	
}
