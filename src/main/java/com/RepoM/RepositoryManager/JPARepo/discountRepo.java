package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepoM.RepositoryManager.Entity.discount;
@Repository
public interface discountRepo extends JpaRepository<discount, Integer>{

}
