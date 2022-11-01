package demo.view;
import java.util.Scanner;

import demo.model.Product;
import demp.service.*;

public class ProductView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);  
		 ProductService productService=new ProductService ();
		 for (int  i = 0;i<3;i++) 
			{
			 System.out.println("Enter ID: ");
			 int Id=sc.nextInt();
			 sc.nextInt();
			 System.out.println("Enter NAME: ");
			 String Name =sc.nextLine();
			 sc.nextLine();
			 System.out.println("Enter PRICE");
			 Double Price =sc.nextDouble();
			 sc.nextDouble();
			 Product product=new Product();
			 productService.setProduct(product);
			}
		   Product productAr[]=productService.getProduct();
		   for (Product product:productAr) {
System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
		   }
		
		   
		
	}

}
