package com.mindtree.candyShope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.candyShope.entity.Candy;

@Repository
public interface CandyRepo extends JpaRepository<Candy, Integer> {

}
