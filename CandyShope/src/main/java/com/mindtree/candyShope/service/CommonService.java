package com.mindtree.candyShope.service;

import java.util.List;

import com.mindtree.candyShope.entity.Candy;
import com.mindtree.candyShope.entity.Shop;

public interface CommonService {
	String addCandy(Candy candy);
	List<Candy>allCandy();
	String addShop(Shop shop);
	List<Shop>allShopes();
	String addCandyToShop(int shopId,int candyId);
	double bill(int candyId,int quentity);
	List<Candy>allCandyOfShop(int shopId);
	List<Candy>lessThenFive();
}
