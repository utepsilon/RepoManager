package com.RepoM.RepositoryManager.JPARepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RepoM.RepositoryManager.Entity.userDetails;
@Repository
public interface userDetailsRepo extends JpaRepository<userDetails, Integer>{

}
