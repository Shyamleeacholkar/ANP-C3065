// TOPIC -  CONDITIONAL STATEMENT IF,IF ELSE,NESTED IF
public class Statment {

	public static void main(String[] args) {
		//int a = 90;								// TODO Auto-generated method stub
		//if (a <=18) {							// condition given
		//	System.out.println("u are elidgeble for voting ");			
		//}
		//else 									//otherwise condition
			//System.out.println("not elg");
		
		// NESTED IF 
		if (false) {
				System.out.println("if- true block 1");
			if (false){
				System.out.println("if- false block 2");
		}else 
			{
				System.out.println("else - false block 1");
			}
		}
		else 
		{
			System.out.println("else - false block 2");
		if (true)
			System.out.println("if - true block 3");
		}	
	}
}
