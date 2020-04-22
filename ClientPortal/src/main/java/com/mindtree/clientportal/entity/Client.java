package com.mindtree.clientportal.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
//@JsonInclude(value=Include.NON_NULL)
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;

	private String clientName;

	private int clientBudget;

	@ManyToOne
	@JsonIgnoreProperties("clients")
	private Company company;



	public int getClientId() {
		return clientId;
	}



	public void setClientId(int clientId) {
		this.clientId = clientId;
	}



	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}



	public int getClientBudget() {
		return clientBudget;
	}



	public void setClientBudget(int clientBudget) {
		this.clientBudget = clientBudget;
	}



//	public Company getCompany() {
//		return company;
//	}
//
//
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}



	public Client() {
		// TODO Auto-generated constructor stub
	}

}
