package coma.app.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,7,8,5,2,9};
		
		int size=arr.length;
		
		//implementing bubble sorting
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		
		
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
		
	}

}
