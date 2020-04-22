package com.mindtree.clientportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.clientportal.entity.Company;
@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
