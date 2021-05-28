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
import com.RepoM.RepositoryManager.Entity.Inventory;
import com.RepoM.RepositoryManager.JPARepo.CategoryRepo;
import com.RepoM.RepositoryManager.JPARepo.InventoryRepo;

@RestController
@RequestMapping("/inventory")
public class inventoryController {
	
	@Autowired
	InventoryRepo invRepo;
	
	
	@GetMapping("/get/{id}")
	public Optional<Inventory> getCategory(@PathVariable int id) {
		return invRepo.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<Inventory> getAllCategory() {
		return invRepo.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@PostMapping("/post")
	public String postCategory(@RequestBody Inventory inv)
	{
		invRepo.save(inv);
		return "success";
	}


	@PostMapping("/postAll")
	public String postCategory(@RequestBody List<Inventory> inv)
	{
		invRepo.saveAll(inv);
		return "success";
	}
}
