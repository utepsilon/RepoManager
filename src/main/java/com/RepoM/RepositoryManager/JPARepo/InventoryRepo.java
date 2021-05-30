package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepoM.RepositoryManager.Entity.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
