// TOPIC- METHOD DEFINATION AND METHOD CALL
//method defination & method call is used for passing value
public class DayThree {
	// declare method void or int as per requirment
	//method defination
	public boolean MyMethod(double number) {		// boolean METHOD defination 
		 boolean status = true ;	 				// return false
		 return false;
	 }
	int Calculate(int num1 , int num2) { 			//with return type with parameter should have return type
		int result = num1+num2;
		int a = 90;                            		// we can return variable or value directly 
		return (90);	
	}
	public static void main(String[] args) {		// TODO Auto-generated method stub
		DayThree DayThreeobj = new DayThree();  	// method call
		//DayThreeobj.Calculate(3, 6);
		//int d = DayThreeobj.Calculate(3, 6);
		//System.out.println("result is"+d);		//object creation is compulsory while int method we use to display the output call											
		//method boolean
		DayThreeobj.MyMethod(46.89);
		System.out.println();
	}

}
