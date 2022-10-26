
public class Practice1 {
	// using method defination 
			int myMethod( int a ,int b ,int c) {
				if (a==b || b==c || a==c) {
					System.out.println("all are same");
				}
				else if  (a>=b && a>=c) {
					System.out.println(" a is greater :"+a);
				}
				else if (b>=a && b>=c) {
						System.out.println(" b is greater:"+b);
					}
				else if (c<=a && c<=b) {
						System.out.println(" c is smaller :"+c);
				}
				return 0;	// return type is compulsary for int method give return 0 if method name not given
			}
			
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5;
		int b = 4;
		int c = 1;
		//statements
		if (a==b || b==c || a==c) {
			System.out.println("all are same");
		}
		else if  (a>=b && a>=c) {
			System.out.println(" a is greater :"+a);
		}
		else if (b>=a && b>=c) {
				System.out.println(" b is greater:"+b);
			}
		else if (c<=a && c<=b) {
				System.out.println(" c is smaller :"+c);
			}*/
	
		// method call
		Practice1 Practice1obj = new Practice1();  
		Practice1obj.myMethod(8,7,1);
	
	}
	

}
