public class LinearSearchSortedArray
{
	public static int linearSearchSorted(int[] array, int target) 
	{
		for(int i = 0; i < array.length; i++) 
		{
			if (array[i] == target) 
			{
				return i; 
			} 
			else if (array[i] > target)
			{
				break; 
			}
		}
		return -1; // Target not found
	}

	public static void main(String[] args) {
	int[] array = {1, 3, 5, 7, 9, 11};
	int target = 7;

	int index = linearSearchSorted(array, target);

	if (index != -1) {
		System.out.println("Target found at index " + index);
	}
	else 
	{
		System.out.println("Target not found in the array");
	}
	}
}