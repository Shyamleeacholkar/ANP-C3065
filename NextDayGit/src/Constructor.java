
class constuct{					//constructor 
int studentId;				//	instance variable
String studentName;				//	instance variable
constuct (int sId,String sName) {	//	method to variable decleratoion same name as class
	studentId=sId;
	studentName=sName;
}
void Display() {				//	method to display the receive values from main
	System.out.println("student id:"+studentId);
	System.out.println("student Name:"+studentName);
}
}
public class Constructor {					//main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//object declaration and creation for method to call
		// int empid;						//	local variable should initilize before calling with some value otherwise it will give comiplation error
		constuct constuctobj1 = new constuct(1,"shaml"); 
		constuct constuctobj2 = new constuct(2,"athrv"); //referance variable
		constuct Cobj;

		
		constuctobj1.Display();
		constuctobj2.Display();//call the method to print value
	}

}
