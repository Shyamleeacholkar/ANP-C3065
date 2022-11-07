
public class User {
	
		static int userId;							
	 static String userName;	
	 
	 public User(){
			
}
	 public User(int uId,String uName)
	 {
		 userId=uId;
		 userName=uName;
	}
					public  void setUserId(int uId) {
						userId=uId;
					}
					public void setUserName(String uName) {
						userName=uName;
					}
					

					public static int getUserId() {	
						return userId ;
					}
					public static String getUserName() {
						return userName;
					}
					

		}

