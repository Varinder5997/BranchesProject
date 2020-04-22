package com.mindtree.candyShope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.candyShope.entity.Shop;
@Repository
public interface ShopRepo extends JpaRepository<Shop, Integer> {

}
