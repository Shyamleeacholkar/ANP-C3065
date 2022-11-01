package demo.model;

public class Product {
	
		int productId;							
		String productName;					
		Double price;	
		
		public Product(){
										//non-parameterized constructor
	}
		public Product(int pId,String pName,Double pr){
			productId=pId;
			productName=pName;
			price=pr;
	}
		public void setProductId(int pId) {
			System.out.println("Product id : "+pId);
		}
		public void setProductName(String pName) {
			System.out.println("Product name : "+pName);
		}
		public void setProductPrice(Double pr) {
			System.out.println("Product price : "+pr);
		}
		
		public int getProductId() {
			System.out.println(productId);
			return productId ;
			
		}
		public void getProductName() {
			System.out.println("product name is: "+productName);
		}
		public void getProductPrice() {
			System.out.println(price);
			
		}
	

}
