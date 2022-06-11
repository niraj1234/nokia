package org.nokia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
		ProductVO p5 = new ProductVO(5, "DJI Drone Mini", 45090);
		ProductVO p6 = new ProductVO(6, "GoPro Hero 5", 27009);

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);

		return new ResponseEntity<List<ProductVO>>(productList,HttpStatus.OK);
	}	
	
	
	@RequestMapping("/product/{pName}")
	public ResponseEntity<ProductVO> getProductByName(@PathVariable("pName") String prodName ){
        HashMap<String,ProductVO> productMap = new HashMap<String,ProductVO>();

		ProductVO p1 = new ProductVO(1, "Mi Mobile", 12223);
		ProductVO p2 = new ProductVO(2, "Dell Inspiron", 67223);
		ProductVO p3 = new ProductVO(3, "Oppo Watch", 5666);
		ProductVO p4 = new ProductVO(4, "Samsung TV", 77272);
		ProductVO p5 = new ProductVO(5, "DJI Drone Mini", 45090);
		ProductVO p6 = new ProductVO(6, "GoPro Hero 5", 27009);

		productMap.put("mobile", p1);
		productMap.put("laptop", p2);
		productMap.put("watch", p3);
		productMap.put("tv", p4);
		productMap.put("drone", p5);
		productMap.put("camera", p6);
		
        ProductVO product = productMap.get(prodName);
		return new ResponseEntity<ProductVO>(product , HttpStatus.OK);

	}
	
	@GetMapping("/random/{count}")
	public ResponseEntity<List<ProductVO>> getProductByCount(@PathVariable("count") int countRequest){
		List<ProductVO> randomProducts = new ArrayList<ProductVO>();
		System.out.println("Number of Random data requested " + countRequest);
		ProductVO p = null;
		for(int i=1 ; i<countRequest ; i++) {
			p = new ProductVO(i, "MObile data - "+i, 1000+i);
			randomProducts.add(p);
		}
		return new ResponseEntity<List<ProductVO>>(randomProducts , HttpStatus.OK); 
	}
	
}
