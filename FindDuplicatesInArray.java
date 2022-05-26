package week1.day2;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] numbers = {12,13,10,12,17,18,19,22,20,13,17,39,40,22};
		
		int length = numbers.length;
		int count;
		for(int i=0;i<length-1;i++)
		{
			count=0;
			for(int j=i+1;j<length;j++)
			{
				if(numbers[i]==numbers[j])
					count++;					
			}
			if(count>0)
				System.out.println(numbers[i]);			
		}
	}

}
