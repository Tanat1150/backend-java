package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mobel.Employee;
import com.example.demo.mobel.Product;

@RestController
public class Productcontroller {

	private List<Product> data = new ArrayList<Product>();

	@GetMapping("/product")
	public List<Product> getProduct() {
		return data;
	}

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product body) {

		for (int i = 0; i < data.size(); i++) {
			if (body.getProductId() == data.get(i).getProductId()) {
				return null;
			}
		}
		data.add(body);
		return body;
	}

	@PutMapping("/product/{ProductId}")
	public Product updatProduct(@PathVariable Integer ProductId, @RequestBody Product body) {
		for (int i = 0; i < data.size(); i++) {
			if (ProductId == data.get(i).getProductId()) {
				data.get(i).setProductname(body.getProductname());
				data.get(i).setProductprice(body.getProductprice());
				data.get(i).setProductamount(body.getProductamount());
				data.get(i).setProductdetail(body.getProductdetail());
				return data.get(i);
			}
		}
		return null;
	}

	@DeleteMapping("/product/{ProductId}")
	public String deletProduct(@PathVariable Integer ProductId) {
		 for (int i=0; i < data.size(); i++) {
				if(ProductId == data.get(i).getProductId()) {
				   data.remove(i);
				   
				   return"delete sucess";
		
	      }
		 
 }
		 return "product not font";
}
	
}