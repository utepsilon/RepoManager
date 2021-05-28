package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RepoM.RepositoryManager.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
