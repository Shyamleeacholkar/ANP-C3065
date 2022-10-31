//TOPIC: ENHANCED FOR LOOP
public class Enhance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,3,4,5,6};				//DECLARATION OR INITILIZATION OF ARRAY
		for (int a:arr1) { 						//SYNTAX OF ENHANCED FOR LOOP
			System.out.println(a);
		}
		
		double arr2[]= {1.2,1.3,1.4,1.5};			//DECLARATION OR INITILIZATION OF ARRAY
		for (double b:arr2) {					//SYNTAX OF ENHANCED FOR LOOP
			System.out.println(b);
		}
		System.out.println("the 2nd position:"+arr2[2]);		//2nd index value of array 2 will be print
		
	}

}
