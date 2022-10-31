//TOPIC:TWO DIMENTIONAL ARRAY
public class twoDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[][]= new arr[3][2];
		int arr1[][]= {{1,4},{1,2},{6,2}};
		
		for	(int i=0;i<arr1.length;i++) {
			for (int j = 0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]+"");
			}
			System.out.println( );
		}
		for (int i[]:arr1) { 				//enhanced for loop
			for (int j:i){
			System.out.println(j+" ");
			}
			System.out.println( );

		}
		
	}

}
