import java.util.Scanner;
public class searcher 
{
		public int linear(int arr[], int size) 
		{
			int index=0;
			int s_value;
			Scanner scan= new Scanner (System.in);
			System.out.print("Enter the value you want found");//step 1 ask them to enter the value//
			s_value=scan.nextInt();
			
			while(index<size) 
			{
				if(arr[index]==s_value) 
				{
					return index;
				}
				index++;
			}
			
			return-1;
		
	
		}
		
		
			public int binary(int arr[], int size) 
			{
				int start=0;
				int end=size-1;
				int mid;
				int s_value=0;
				while(start<=end) 
				{
					mid=(start+end)/2;
					if(s_value==arr[mid]) 
					{
						return mid;
					}
					if(s_value<arr[mid]) 
					{
						end=mid-1;
					}
					if(s_value>arr[mid]) 
					{
						start=mid++;
					}
				}
				return-1;
			}
			
}

			

		
		


