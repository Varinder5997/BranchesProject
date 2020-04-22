package com.mindtree.clientportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;
import com.mindtree.clientportal.service.ClientPortalService;

@RestController
public class ClientPortalController {
	
	@Autowired
	ClientPortalService service;
	
	@PostMapping("/client")
	public String addClient(@RequestBody Client client) {
		return this.service.addClient(client);	
	}
	
	@PostMapping("/company")
	public String addCompany(@RequestBody Company company) {
		return this.service.addCompnay(company);
	}
	@GetMapping("/all-client")
	public List<Client> showClient(){
		return this.service.allClient();
	}
	@GetMapping("/company")
	public List<Company> showCompany(){
		return this.service.allCompany();
	}
	@PutMapping("/client-to-company/{companyId}/{clientId}")
	public String addClientToCompany(@PathVariable int companyId,@PathVariable int clientId) {
		return this.service.addClientToCompany(companyId, clientId);
	}
	
	@GetMapping("/client-of-company/{companyId}")
	public List<Client> clientOfCompany(@PathVariable int companyId){
		return this.service.allClientOfCompany(companyId);
	}
	@PutMapping("/update-budget/{clientId}")
	public String updateBudget(@PathVariable int clientId ,@RequestParam int newBudget) {
		return this.service.updateBudget(clientId, newBudget);
	}

	
}
