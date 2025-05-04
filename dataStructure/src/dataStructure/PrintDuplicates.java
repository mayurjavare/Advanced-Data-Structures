package dataStructure;

public class PrintDuplicates {

	public static void main(String[] args) {
		int arr[] = new int[] {5,12,10,3,5,3,12,10,7,-999};
		int cnt[] = new int [13];
		int i,j;
		
		for(i=0;arr[i]!=-999;i++)
		{
			cnt[arr[i]]++;
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
		for(i=0;arr[i]!=-999;i++)
		{
			if(cnt[arr[i]]>1)
			{
				System.out.print(arr[i]+"  ");
			}
			cnt[arr[i]]=0;
		}
	}

}
