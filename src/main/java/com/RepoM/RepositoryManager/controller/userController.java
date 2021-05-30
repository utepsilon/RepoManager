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
import com.RepoM.RepositoryManager.Entity.user;
import com.RepoM.RepositoryManager.JPARepo.userRepo;

@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	userRepo userR;
	
	
	@GetMapping("/get/{id}")
	public Optional<user> getCategory(@PathVariable int id) {
		return userR.findById(id);
	}
	
	@GetMapping("/getAll")
	public List<user> getAllCategory() {
		return userR.findAll();
	}
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@PostMapping("/post")
	public String postCategory(@RequestBody user u)
	{
		userR.save(u);
		return "success";
	}


	@PostMapping("/postAll")
	public String postCategory(@RequestBody List<user> ul)
	{
		userR.saveAll(ul);
		return "success";
	}
}
