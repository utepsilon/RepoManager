package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepoM.RepositoryManager.Entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
