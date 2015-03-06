package selection.controller;

import selection.model.Pokemon;

public class SelectionMachine
{
	public void SelectionMachine()
	{
		
		
		
		
	}
	
	
	
	private void swap(Pokemon [] array, int position, int change)
	{
		Pokemon temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) %24+ "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) %60+ "\n";
		timeToSort += "Seconds: " + sortTime/(1000) %60+ "\n";
		timeToSort += "Milliseconds: " + sortTime %  1000 + "\n";
		
		return timeToSort;
	}
	
	public int[] selectionSort(int [] toBeSorted)
	{
		int minimum;
		int minimumPosition;
//		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
//		endTime = System.currentTimeMillis();
		
		return toBeSorted;
	}
	
	public Pokemon [] selectionSort(Pokemon [] sortThePokemon)
	{
		int maximumPosition;
		Pokemon maximum;
//		startTime = System.currentTimeMillis();
		for(int position = 0; position < sortThePokemon.length; position ++)
		{
			maximumPosition = position;
			maximum = sortThePokemon[position];
			for(int next = position + 1; next < sortThePokemon.length; next++)
			{
				if(sortThePokemon[next].compareTo(maximum) > 0)
				{
					maximum = sortThePokemon[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(sortThePokemon, position, maximumPosition);
			}
		}
//		endTime = System.currentTimeMillis();
//		sortTime = endTime - startTime;
		
		return sortThePokemon;
		
	}

}
