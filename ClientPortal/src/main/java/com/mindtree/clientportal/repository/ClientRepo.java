package com.mindtree.clientportal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.clientportal.entity.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {

}
