package com.mindtree.clientportal.service;

import java.util.List;

import com.mindtree.clientportal.entity.Client;
import com.mindtree.clientportal.entity.Company;

public interface ClientPortalService {
	String addClient(Client client);
	String addCompnay(Company company);
	List<Client> allClient();
	List<Company> allCompany();
	String addClientToCompany(int companyId,int clientId);
	List<Client> allClientOfCompany(int companyId);
	String updateBudget(int clientId,int newBudget);

}
