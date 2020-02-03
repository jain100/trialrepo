package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userAppRepo extends JpaRepository<userAppPackage,Integer>{
	
 public List<userAppPackage> findByAppid(int appid);

}
