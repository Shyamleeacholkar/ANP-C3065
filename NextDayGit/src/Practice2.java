
public class Practice2 {
													//method defination
	public void  setIntArray (int arr1 [])
	{												//arguments should pass here
		for (int  i = 0;i<arr1.length;i++) 
		{
			System.out.println(arr1[i]);
		}
	}	
public static void main(String[] args) {
													// TODO Auto-generated method stub
													//method call
		int arr1[]=new int [2];
		arr1[0]=22;
		arr1[1]=45;
		Practice2 Practice2obj = new Practice2();  
		Practice2obj.setIntArray(arr1);
	
	}

}
