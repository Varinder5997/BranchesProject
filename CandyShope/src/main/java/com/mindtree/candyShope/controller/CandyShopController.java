package com.mindtree.candyShope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.candyShope.entity.Candy;
import com.mindtree.candyShope.entity.Shop;
import com.mindtree.candyShope.service.CommonService;

@RestController
public class CandyShopController {
	@Autowired
	CommonService service;
	
	@PostMapping("/candy")
	public String addCandy(@RequestBody Candy candy) {
		return this.service.addCandy(candy);
	}
	
	@PostMapping("/shop")
	public String addShop(@RequestBody Shop shop) {
		return this.service.addShop(shop);
	}
	@GetMapping("/candies")
	public List<Candy> allCandy(){
		return this.service.allCandy();
	}
	@GetMapping("/shops")
	public List<Shop> allShops(){
		return this.service.allShopes();
	}
	@PutMapping("assign/{shopId}/{candyId}")
	public String assignShop(@PathVariable int shopId, @PathVariable int candyId) {
		return this.service.addCandyToShop( shopId , candyId);
	}
	@GetMapping("/price/{candyId}/{quentity}")
	public double priceOfCandy(@PathVariable int candyId,@PathVariable int quentity) {
		return this.service.bill(candyId,quentity);
	}
	@GetMapping("/{shopId}/candy")
	public List<Candy> allCandy(@PathVariable int shopId){
		return this.service.allCandyOfShop(shopId);
	}
	@GetMapping("/get-less-then-five")
	public List<Candy> lessThenFive(){
		return this.service.lessThenFive();
	}

}
