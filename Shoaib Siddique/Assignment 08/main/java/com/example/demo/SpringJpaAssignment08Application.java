package com.example.demo;

import java.awt.print.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Book.Repository.Bookrepository;

@SpringBootApplication
public class SpringJpaAssignment08Application {
     
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAssignment08Application.class, args);
	}

	@Autowired
	Bookrepository Repository;
	
     
	public void run(String[] args) throws Exception {
		System.out.println("Table created !!");

		// bookRepository.save(book1);
		// Book book1=new Book(101,"java","ShoaibSid");
		/*
		 * for(int i=1;i<=5;i++) { int counter=100+i; //Book book1=new Book();
		 * bookRepository.save(book1); Book book1=new Book(101,"java","ShoaibSid");
		 * 
		 * /* Product product1=new Product(counter,"T-shirt -"+i,"CSK Tshirt");
		 * productRepository.save(product1); Product product1=new
		 * Product(counter,"T-shirt -"+i,"CSK Tshirt");
		 * productRepository.save(product1); Product product1=new
		 * Product(counter,"T-shirt -"+i,"CSK Tshirt");
		 * productRepository.save(product1); Product product1=new
		 * Product(counter,"T-shirt -"+i,"CSK Tshirt");
		 * productRepository.save(product1);
		 */

	}

	/*
	 * List<Product> productList=productRepository.findAll(); for(Product
	 * product:productList) System.out.println(product);
	 * 
	 * 
	 * 
	 * Optional<Product> product =productRepository.findById(103);
	 * if(product.isPresent()) System.out.println(product); else
	 * System.out.println("Product not found!!");
	 */

//		productRepository.fin
//		
//		System.out.println("Select product is :");
//		Optional<Product> p=productRepository.findById(101);
//		if(p.isPresent())
//			System.out.println(p);
//		else
//			System.out.println("Product not found!!");
//		

}
