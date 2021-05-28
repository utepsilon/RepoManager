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
import com.RepoM.RepositoryManager.Entity.discount;
import com.RepoM.RepositoryManager.JPARepo.CategoryRepo;
import com.RepoM.RepositoryManager.JPARepo.discountRepo;

@RestController
@RequestMapping("/discount")
public class discountController {
	
	@Autowired
	discountRepo disc;
	
	
	@GetMapping("/get/{id}")
	public Optional<discount> getCategory(@PathVariable int id) {
		return disc.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<discount> getAllCategory() {
		return disc.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@PostMapping("/post")
	public String postCategory(@RequestBody discount dis)
	{
		disc.save(dis);
		return "success";
	}


	@PostMapping("/postAll")
	public String postCategory(@RequestBody List<discount> dis)
	{
		disc.saveAll(dis);
		return "success";
	}
}
