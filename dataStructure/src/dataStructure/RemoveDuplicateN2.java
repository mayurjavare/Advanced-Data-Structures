package dataStructure;

public class RemoveDuplicateN2
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {5,12,10,3,5,3,12,10,7,9,5,8,4,11,-999};
		int tar[] = new int[15];
		int i,j;
		int tar_index=0;
		tar[0]=arr[0];
		
		for(i=1;arr[i]!= -999;i++)
		{
			for(j=0;j<=tar_index;j++)
			{
				if(arr[i]==tar[j])
					break;
			}
			if(j>tar_index)
			{
				tar_index++;
				tar[tar_index]=arr[i];
			}
		}
		tar[tar_index]=-999;
		for(i=0;tar[i]!=-999;i++)
		{
			System.out.print(tar[i]+" ");
		}
	}
}
