package selection.controller;

import java.util.ArrayList;

import selection.model.Pokemon;

public class SelectionMachine
{
	public void SelectionMachine()
	{
		int[][] arr = new int[30][30];
		quickSort(arr[20], 0, 19);
		
		
		
	}
	
	
	
	private void swap(int toBeSorted[], int position, int change)
	{
		int temp = toBeSorted[position];
		toBeSorted[position] = toBeSorted[change];
		toBeSorted[change] = temp;
	}
	
	private void swap(Pokemon [] toBeSorted, int position, int change)
	{
		Pokemon temp = toBeSorted[position];
		toBeSorted[position] = toBeSorted[change];
		toBeSorted[change] = temp;
	}
	
	private void swap(ArrayList<Integer> myIntList, int firstSpot, int secondSpot)
	{
		int temp = myIntList.get(firstSpot);
		myIntList.set(firstSpot, myIntList.get(secondSpot));
		myIntList.set(secondSpot,  temp);
	}
	
	// lo is the index of the leftmost element of the subarray
		// hi is the index of the rightmost element of the subarray (inclusive)
	
	private int partition(int arr[], int lo, int hi)
	{
		int left = lo;
		int right = hi;
		int temp;
		int pivot = arr[(left + right) / 2];
		
		while(left <= right)
		{
			while (arr[left] < pivot)
			{
				left++;
			}
			
			while(arr[right] > pivot)
			{
				right--;
			}
			
			if(left <= right)
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		return left;
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
//		long startTime = System.currentTimeMillis();
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
//				swap(toBeSorted, position, minimumPosition);
			}
		}
//		endTime = System.currentTimeMillis();
		
		return toBeSorted;
	}
	
	public Pokemon [] selectionSort(Pokemon [] sortThePokemon)
	{
		long endTime; long sortTime;
		int maximumPosition;
		Pokemon maximum;
		long startTime = System.currentTimeMillis();
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
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return sortThePokemon;
		
	}
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> listOfInts)
	{
		long endTime; long sortTime;
		int minimumPosition;
		int minimum;
		long startTime = System.currentTimeMillis();
		for(int position = 0; position < listOfInts.size(); position ++)
		{
			minimumPosition = position;
			minimum = listOfInts.get(position);
			for(int next = position + 1; next < listOfInts.size(); next++)
			{
				if(listOfInts.get(next) < minimum)
				{
					minimum = listOfInts.get(next);
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(listOfInts, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return listOfInts;
		
	}
	
	
	public void quickSort(int arr[], int lo, int hi)
	{
		if(lo < hi)
		{
			int index = partition(arr, lo, hi);
			if (lo < index - 1)
			{
				quickSort(arr, lo, index - 1);
			}
			
			if(index < hi)
			{
				quickSort(arr, index, hi);
			}
		}
	
	}

}
