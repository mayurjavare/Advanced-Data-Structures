package dataStructure;

public class RemoveDuplicates
{
	 
	public static void main(String[] args)
	{
		int arr[] = new int[] {5,12,10,3,5,3,12,10,7,-999};
		int i,j;
		int cnt[] = new int[13];
		
		for(i=0;arr[i]!=-999;i++)
		{
			cnt[arr[i]] = cnt[arr[i]]+1;
		}
		
		for(i=0,j=0;arr[i]!=-999;i++)
		{
			if(cnt[arr[i]]>0)
			{
				arr[j]=arr[i];
				j++;
				cnt[arr[i]] = 0;
			}
		}
		arr[j] = -999;
		for(i=0;arr[i]!= -999;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
