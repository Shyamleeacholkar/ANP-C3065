//VARIABLE ARGUMENTS:its compulsory to give end of parameter in method 
//how many times we call the method it will be executed with given parameters 
//object creation is compulsory to call the method in main method 
public class VariableArguments {
		public void setVarArgs(int ...paramVar) {	//setvariablearguments method should declare with parameter 
			System.out.println("hey");
			for (int a:paramVar)
				System.out.println(a);
			
		}
		public void setVarArgs1(int ...paramVar1) {
			System.out.println("hello");
			for (int a1:paramVar1)
				System.out.println(a1);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArguments VariableArgumentsobj = new VariableArguments(); 
		VariableArgumentsobj.setVarArgs();
		VariableArgumentsobj.setVarArgs1();
		System.out.println("********");

		VariableArgumentsobj.setVarArgs(1,2,3);
		VariableArgumentsobj.setVarArgs1(4,5,6);

	}

}
