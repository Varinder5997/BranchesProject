package com.mindtree.clientportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;
import com.mindtree.clientportal.repository.ClientRepo;
import com.mindtree.clientportal.repository.CompanyRepo;

@Service
public class ClientPortalServiceImpl implements ClientPortalService {
	
	@Autowired
	ClientRepo clientRepo;
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public String addClient(Client client) {
		this.clientRepo.save(client);
		return "Client is Added Successfull";
	}

	@Override
	public String addCompnay(Company company) {
		this.companyRepo.save(company);
		return "Company is added succesfully";
	}

	@Override
	public List<Client> allClient() {
		List<Client>allClient= this.clientRepo.findAll();
		return allClient;
	}

	@Override
	public List<Company> allCompany() {
		List<Company>allCompany=this.companyRepo.findAll();
		return allCompany;
	}

	@Override
	public String addClientToCompany(int companyId, int clientId) {
		Client client =this.clientRepo.findById(clientId).get();
		Company company =this.companyRepo.findById(companyId).get();
		client.setCompany(company);
		this.clientRepo.save(client);
		return "Client is added to company";
	}

	@Override
	public List<Client> allClientOfCompany(int companyId) {
		Company company=this.companyRepo.findById(companyId).get();
		List<Client>clients=company.getClients();
		return clients;
	}

	@Override
	public String updateBudget(int clientId,int newBudget) {
		Client client=this.clientRepo.findById(clientId).get();
		client.setClientBudget(newBudget);
		this.clientRepo.save(client);
		return "Budget is updated succesfully";
	}

}
