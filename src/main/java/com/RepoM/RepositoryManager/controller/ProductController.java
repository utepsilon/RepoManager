package com.RepoM.RepositoryManager.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.RepoM.RepositoryManager.Entity.Product;
import com.RepoM.RepositoryManager.JPARepo.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepo proRepo;
	
	
	@GetMapping("/get/{id}")
	public Optional<Product> getCategory(@PathVariable int id) {
		return proRepo.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<Product> getAllCategory() {
		return proRepo.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@PostMapping("/post")
	public String postCategory(@RequestBody Product pro)
	{
		proRepo.save(pro);
		return "success";
	}


	@PostMapping("/postAll")
	public String postCategory(@RequestBody List<Product> pro)
	{
		proRepo.saveAll(pro);
		return "success";
	}
}
