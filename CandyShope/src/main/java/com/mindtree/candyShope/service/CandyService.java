package com.mindtree.candyShope.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.candyShope.entity.Candy;
import com.mindtree.candyShope.entity.Shop;
import com.mindtree.candyShope.repository.CandyRepo;
import com.mindtree.candyShope.repository.ShopRepo;
@Service
public class CandyService implements CommonService{

	@Autowired
	CandyRepo candyRepo;
	@Autowired
	ShopRepo shopRepo;
	@Override
	public String addCandy(Candy candy) {
		this.candyRepo.save(candy);
		return "Candy is added succesfull";
	}

	@Override
	public List<Candy> allCandy() {
		List<Candy>allCandy =this.candyRepo.findAll();
		return allCandy;
	}

	@Override
	public String addShop(Shop shop) {
		this.shopRepo.save(shop);
		return "Shop is added Successfull";
	}

	@Override
	public List<Shop> allShopes() {
		List<Shop>allShopes=this.shopRepo.findAll();
		return allShopes;
	}

	@Override
	public String addCandyToShop( int shopId,int candyId) {
		Candy candy=this.candyRepo.findById(candyId).get();
		Shop shop=this.shopRepo.findById(shopId).get();
		candy.setShop(shop);
		this.candyRepo.save(candy);
		return "Candy is added to shop is added successfull";
	}

	@Override
	public double bill(int candyId,int quentity) {
		Candy candy=this.candyRepo.findById(candyId).get();
		double bill=candy.getPrice();
		bill=bill+(bill*12)/100;
		bill=bill+(bill*2)/100;
		bill=bill*quentity;
		return bill;
	}

	@Override
	public List<Candy> allCandyOfShop(int shopId) {
		Shop shop=this.shopRepo.findById(shopId).get();
		List<Candy>allCandy=shop.getCandies();
		return allCandy;
	}

	@Override
	public List<Candy> lessThenFive() {
		List<Candy> allCandy=this.candyRepo.findAll();
		List<Candy> lessThenFive=new ArrayList<Candy>();
		for (Candy candy : allCandy) {
			if(candy.getStok()<5) {
				lessThenFive.add(candy);
			}
		}
		return lessThenFive;
	}
	

}
