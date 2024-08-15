package com.example.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	// 400, 401, 403, 500, 503, 200

	@GetMapping("/list")
	public List<Product> getList() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("P-01", "Coca cola", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-02", "Pepsi", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-03", "Sting", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-04", "Red Bull", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-05", "Tea plus", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));

		return products;
	}

	@GetMapping("/detail/{id}")
	public Product getDetail(@PathVariable String id) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product("P-01", "Coca cola", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-02", "Pepsi", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-03", "Sting", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-04", "Red Bull", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));
		products.add(new Product("P-05", "Tea plus", 100, 10000, "12-12-2022", "Coca cola desc", "", "1"));

		Product prd = null;
//		Product prd = products.stream().filter(p -> p.getId().equals(id)).collect(Collectors.toList()).get(0);

		for (Product product : products) {
			if (product.getId().equals(id)) {
				prd = product;
			}
		}

		return prd;
	}

}
