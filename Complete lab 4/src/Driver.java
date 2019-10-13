import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) {
		int num;
		int size=5;
		int i;
		int arr[]=new int[5];//array size//

		Scanner scan=new Scanner(System.in);
		
		for(i=0;i<size;i++)
		{
			System.out.print("Enter a number");//prompt and stores the numbers//
			arr[i]=scan.nextInt();
		}
		
		for(i=0;i<size;i++) 
		{
			System.out.print(""+arr[i]);//prints numbers in array//
		}
		
		
		System.out.print("\n Select the type of  sort you want to use \n 1.Selection \n 2.insertion  \n 3.bubble 4. linear   \\n 5.binary ");
		num = scan.nextInt();
		 
		 
		 Sorter Sort =new Sorter();//calling a function step 1//
		 searcher search= new searcher();
		
		 
		 
		 switch (num) {
					 case 1:  Sort.selection(arr, size);
					 		  break;
					 		  
					 case 2:  Sort.insertion(arr, size);
					 		 break;
					 		 
					 case 3:  Sort.bubble(arr, size);
			 		 break;
			 		 

					  case 4:  search.linear(arr, size);
					  break;
					  
					  case 5: search.binary(arr, size);
					  break;
 		 
		
	     
				      default: System.out.print("invaild number");
				     break;
	 }
		 
		
		 
		 
		 
					  
			  
		  }
	}


