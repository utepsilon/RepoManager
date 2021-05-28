package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.RepoM.RepositoryManager.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
