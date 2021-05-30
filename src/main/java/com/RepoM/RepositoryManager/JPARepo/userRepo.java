package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepoM.RepositoryManager.Entity.user;
@Repository
public interface userRepo extends JpaRepository<user, Integer>{

	
}
