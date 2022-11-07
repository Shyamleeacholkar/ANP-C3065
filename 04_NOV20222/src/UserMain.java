import java.util.Scanner;


public class UserMain {

	public static void main(String[] args) {	
		 User userArr[]=new User[2];
		 Scanner sc= new Scanner(System.in);  
		 for (int i = 0;i<userArr.length;i++) 
			{
			 System.out.println("Enter ID: ");
				 int uId=sc.nextInt();
			 System.out.println("Enter NAME: ");
				 String uName =sc.nextLine();
				 sc.nextLine();
				 
				 User userobj=new User();
				//using setter or getter method
				userobj.setUserId(uId);
				userobj.setUserName(uName);
		//by passing parameter constructor
				//User userobj1=new User(uId,uName);
		 userArr[i]=userobj;//storing user object in user array
	}
		// System.out.println(userArr[1]);
		 for(User u:userArr) {
			 System.out.println(User.getUserId()+" "+User.getUserName());
		 }
	}
}
