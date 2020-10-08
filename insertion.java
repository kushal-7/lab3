class insertion{

	public static void insertion_1(int temp[]){
		int n=temp.length;
		for (int k=1;k<n;k++)
		{
			int l=temp[k];
			int i=k-1;

			while((i> -1) && temp [i] > l){
				temp[i+1]= temp[i];
				i--;

			}
			temp[i+1]=l;
		}

	}

	public static void main(String[] args) {
		
		int [] array={6,3,2,5,7};
	

		for(int i:array)
		{
		
			System.out.print(i);
		}
		System.out.println();

		//after inseration sort
		insertion_1(array);
	

		for (int i:array){
			System.out.print(i);
		}


	}
}