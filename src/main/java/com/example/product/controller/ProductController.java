package com.example.product.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@Controller
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@RequestMapping(path = "/add-product",method = RequestMethod.POST )
	public ModelAndView addProduct(@ModelAttribute Product product) {
		productService.addProduct(product);
		return new ModelAndView("redirect:/index.jsp");

	}

	@RequestMapping("/display-products")
	public ModelAndView findAllProducts() {
		List<Product> products = productService.findAllProducts();
		return new ModelAndView("display_product.jsp","products",products);
	}

	@RequestMapping("/delete-product")
	public ModelAndView deleteProduct(@RequestParam("product_id")  int productId) {
		productService.deleteProduct(productId);
		return new ModelAndView("redirect:/display-products");
	}

}
