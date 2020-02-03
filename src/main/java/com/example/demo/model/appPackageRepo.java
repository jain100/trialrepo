package com.example.demo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface appPackageRepo extends JpaRepository<APPPACKAGETEST,Integer> {

    public APPPACKAGETEST findByPackagename(String Packagename);

}
