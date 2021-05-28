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

import com.RepoM.RepositoryManager.Entity.Category;
import com.RepoM.RepositoryManager.JPARepo.CategoryRepo;

@RestController
@RequestMapping("/category")
public class categoryController {
	
	@Autowired
	CategoryRepo catRepo;
	
	
	@GetMapping("/get/{id}")
	public Optional<Category> getCategory(@PathVariable int id) {
		return catRepo.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<Category> getAllCategory() {
		return catRepo.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@PostMapping("/post")
	public String postCategory(@RequestBody Category cat)
	{
		catRepo.save(cat);
		return "success";
	}


	@PostMapping("/postAll")
	public String postCategory(@RequestBody List<Category> cat)
	{
		catRepo.saveAll(cat);
		return "success";
	}
}
