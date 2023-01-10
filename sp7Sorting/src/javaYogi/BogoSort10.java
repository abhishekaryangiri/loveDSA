package javaYogi;

public class BogoSort10 {
	public static void main(String[] args)
	{
		//Enter array to be sorted here
		int[] arr={10,100,200,123,555, 8,9,13,110};
 
		BogoSort10 now=new BogoSort10();
		System.out.print("Unsorted: ");
		now.display1D(arr);
 
		now.bogo(arr);
 
		System.out.print("Sorted: ");
		now.display1D(arr);
	}
	void bogo(int[] arr)
	{
		//Keep a track of the number of shuffles
		int shuffle=1;
		for(;!isSorted(arr);shuffle++)
			shuffle(arr);
		//Boast
		System.out.println("This took "+shuffle+" shuffles.");
	}
	void shuffle(int[] arr)
	{
		//Standard Fisher-Yates shuffle algorithm
		int i=arr.length-1;
		while(i>0)
			swap(arr,i--,(int)(Math.random()*i));
	}
	void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	boolean isSorted(int[] arr)
	{
 
		for(int i=1;i<arr.length;i++)
			if(arr[i]<arr[i-1])
				return false;
		return true;
	}
	void display1D(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	} 
}
