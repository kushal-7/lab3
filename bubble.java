class bubble{
	public static void bubb(int temp[]){
		int n=temp.length;
		int l=0;
		for(int k=0;k<n;k++)
		{
			for (int j=1;j<n-k;j++ ) 
			{
				if(temp[j-1]>temp[j]){
					l=temp[j-1];
					temp[j-1]=temp[j];
					temp[j]=l;

				}
			}

		}
	}

	public static void main(String[] args) 
	{
		int array[]={2,7,1,4,3,6};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();

		bubb(array);

		for(int i:array){
			System.out.print(i+" ");
		}

	}
}