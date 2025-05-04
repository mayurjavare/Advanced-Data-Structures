package dataStructure;

public class OccurenceOfElement {

	public static void main(String[] args)
	{
		int arr[] = new int[] {5,12,10,3,5,3,12,12,10,7,9,5,8,4,11,3,-999};
		int cnt[] = new int[13];
		int i,j;
		
		
		for(i=0;arr[i]!=-999;i++)
		{
			cnt[arr[i]]+=1;
		}
		for(i=0,j=0;arr[i]!=-999;i++)
		{
			if(cnt[arr[i]]>0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=-999;
		
		int max = cnt[0];
		int index = 0;
		int min=0;
		System.out.println();
		for(i=1;i<cnt.length;i++)
		{
			//System.out.print(cnt[i]+"  ");
			if(cnt[i]>max)
			{
				max=cnt[i];
			}
		}
		min=max;
		for(i=1;i<cnt.length;i++)
		{
			//System.out.print(cnt[i]+"  ");
			if(cnt[i]<min && cnt[i]!=0)
			{
				min=cnt[i];
			}
		}
		System.out.println("Min Occurences");
		for(i=0;i<cnt.length;i++)
		{
			if(cnt[i]==min)
			{
				System.out.println(i+" = "+min+"times");
			}
		}
		System.out.println("\n"+"Max Occurences");
		for(i=0;i<cnt.length;i++)
		{
			if(cnt[i]==max)
			{
				System.out.println(i+" = "+max+"times");
			}
		}
		
		
	}

}
