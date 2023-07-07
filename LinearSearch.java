public class LinearSearch 
{
	public static int linearSearch(int[] array, int target) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == target) 
			{
				return i; // Target found, return the index
			}
		}
			return -1; // Target not found
	}

	public static void main(String[] args)
	{
		int[] array = {4, 2, 9, 7, 5, 1, 8, 3, 6};
		int target = 7;

		int index = linearSearch(array, target);
		if (index != -1) 
		{	
			System.out.println("Target found at index " + index);	
		}
		 else 	
		{
			System.out.println("Target not found in the array");
		}
	}
}