//write a program to sort array elements using bubble sort

package apjfsa;

//class Declaration
public class BubbleSort
{
//main method
	public static void main(String[] args)
	{
		//Initializing array
		int[] arr=new int[] {75,25,10,55,65,85};
		
		//displaying elements before sorted
		System.out.println("Array before bubble sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				//checks if the current element is greater than the next element
				if(arr[i]>arr[j])
				{
					//swapping elements
					int temp=arr[i];//the element store in the temporary variable
					arr[i]=arr[j];//replacing the element with next element
					arr[j]=temp;
				}
			}
		}
	
		//Displaying an array elements after sorting
		System.out.println("Array after bubble sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");//printing elements
		}
	}
}
	  