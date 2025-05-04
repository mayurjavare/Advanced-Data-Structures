package dataStructure;

public class RemoveDuplicatesN3 {

	public static void main(String[] args) {
		int arr[] = new int[] {5,12,10,3,5,3,12,10,7,9,5,8,4,11,-999};
		int i,j,k;
		
		for(i=0;arr[i]!=-999;i++)
		{
			for(j=i+1;arr[j]!=-999;j++)
			{
				if(arr[i]==arr[j])
				{
					for(k=j;arr[k]!=-999;k++)
					{
						arr[k]=arr[k+1];
						//System.out.print(arr[k]+"  ");
					}
				}
			}
			System.out.print(arr[i]+"  ");
		}

	}

}
