package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.RepoM.RepositoryManager.Entity.Inventory;


public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
