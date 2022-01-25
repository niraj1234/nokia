package org.nokia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


	@GetMapping("/products")
	public ResponseEntity<List<ProductVO>> getAllProducts(){

		System.out.println("In the product Controller Get app products method ==>");

		List<ProductVO> productList = new ArrayList<>();
		ProductVO p1 = new ProductVO(1, "Mi Mobile", 12223);
		ProductVO p2 = new ProductVO(2, "Dell Inspiron", 67223);
		ProductVO p3 = new ProductVO(3, "Oppo Watch", 5666);
		ProductVO p4 = new ProductVO(4, "Samsung TV", 77272);

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);

		return new ResponseEntity<List<ProductVO>>(productList,HttpStatus.OK);
	}

	
}
