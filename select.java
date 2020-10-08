class select{
	public static void sel(int temp[]){
		int n=temp.length;
		for(int k=0;k<n-1;k++){
			//finding smallest_element between kth element and last element
			int smallest_index=k;
			for (int h=k+1; h<n;h++){
			if(temp[smallest_index]>temp[h])
					smallest_index=h;
			}	
			int x=temp[smallest_index];
			temp[smallest_index]=temp[k];

			temp[k]=x;
		}


	}

	public static void main(String[] args) {
		
	int [] array={4,2,6,1,8,5};
	int n=array.length;

	for(int i:array){
		System.out.print(i+" ");
	}
	System.out.println();

	sel(array);

	for (int i:array){
		System.out.print(i+" ");
	}




	}
}