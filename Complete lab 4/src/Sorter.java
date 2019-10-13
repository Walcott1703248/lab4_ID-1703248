

public class Sorter 
{
		

	public int[]  selection(int arr[],int size)
	{
		int index=0;
		int smallest_i=0;
		int position,temp;
		
		while(index<size) 
		{
			smallest_i=index;
			position=index+1;
			
			while(position<size) 
			{
				if(arr[position]<arr[smallest_i]) 
				{
				smallest_i=position;	
				}
				position++;
			}
			temp=arr[index];
			arr[index]=arr[smallest_i];
			arr[smallest_i]=temp;
			index++;
			
			
		}
		return arr;
	}
	
			
	
	
		
			
	 
				
	
	
	
	public int[] insertion(int arr[],int size) 
	{
	
		int index=1;
		int temp,position;
		while(index<size) 
		{
		 temp=arr[index];	
		 position=index;
		 while(position>=0 && temp<=arr[position-1]) 
		 {
			 arr[position]=arr[position-1];
			 position--;
		 }
		 arr[position]=temp;
		 index++;
		 
		}
		return arr;
	}

	
	   
	
	
		
	
	
			
	
	public int[] bubble(int arr[],int size) {
		
	 int swap=1;
	 int index=0;
	 int position;
	 int temp;
	 
	 while(index<size && swap==1) 
	 {
		 swap=0;
		 position=size-1;
		 while(position>index) 
		 {
			 if(arr[position]<arr[position-1])
			 {
				 temp=arr[position-1];
				 arr[position-1]=arr[position];
				 arr[position]=temp;
				 swap=1;
			 }
			 position--;
				 
			 }
		 index++;
		 }
	  return arr;
	 }

}

	
	


